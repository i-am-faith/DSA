class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++)
        {
            String str = details[i];
            String ages = str.substring(11,13);
            int age = Integer.parseInt(ages);
            if(age > 60)
            {
                count++;
            }
        }
        return count;
    }
}