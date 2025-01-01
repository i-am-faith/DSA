import java.util.ArrayList;

public class Solution {
    static int maximumSubarraySum(int n, ArrayList<Integer> v) {
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(v.get(i) > 0)
            {
                sum += v.get(i);
            }
        }
        return sum;
    }
}