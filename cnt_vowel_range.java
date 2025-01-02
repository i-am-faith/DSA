class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int qn = queries.length;
        int[] prefixsum = new int[n + 1];
        for(int i=0;i<n;i++)
        {
            if(Isvowel(words[i].charAt(0)) && Isvowel(words[i].charAt(words[i].length()-1)))
            {
                prefixsum[i+1] = prefixsum[i] + 1;
            }
            else
            {
                prefixsum[i+1] = prefixsum[i];
            }
        }

        int[] result = new int[qn];
        for(int i=0;i<qn;i++)
        {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefixsum[ri + 1] - prefixsum[li];
        }

        return result;
    }
    public boolean Isvowel(char c)
    {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
    }
}