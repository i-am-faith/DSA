class Solution {
    public int minimumPushes(String word) {
        int result = 0;
        int[] count = new int[26];
        for(int i=0;i<word.length();i++)
        {
            count[word.charAt(i)-'a']++;
        }
        Arrays.sort(count);
        for(int i=25;i>=0;i--)
        {
            double press = Math.ceil((26-i)/8.0) * count[i];
            result += press;
        }
        return result;
    }
}