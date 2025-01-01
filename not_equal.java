import java.util.*;

public class Solution {
    static int canYouMakeDifference(int n, String s) {
        int count = 0;
        if(s.length() == 1)
        {
            return 0;
        }

        char[] str = s.toCharArray();
        char vars = str[0];
        for(int i=0;i<str.length;i++)
        {
            if(vars == str[i])
            {
                count++;
            }
        }
        if(count == str.length)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}