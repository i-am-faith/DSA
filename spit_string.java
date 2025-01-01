import java.util.*;
class Solution {
    public int maxScore(String s) {
        char[] str = s.toCharArray();
        int count1 = 0 , count0 = 0, maxsum = 0;
        //counting all ones
        for(int i=0;i<str.length;i++)
        {
            if(str[i] == '1')
            {
                count1++;
            }
        }

        for(int i=0;i<str.length-1;i++)
        {
            if(str[i] == '0')
            {
                count0++;
            }
            else
            {
                count1--;
            }
            int val = count0+count1;
            maxsum = Math.max(maxsum,val);
        }

        return maxsum;
    }
}