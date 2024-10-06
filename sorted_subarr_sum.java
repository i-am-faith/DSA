import java.util.*;
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> arrl = new ArrayList<>();
        long mod = 1_000_000_007;
        long sum = 0;
        for(int i=0;i<n;i++)
        {
            long res = 0;
            for(int j=i;j<n;j++)
            {
                res += nums[j];
                arrl.add(res);
            }
        }

        Collections.sort(arrl);
        for(int i=left-1;i<right;i++)
        {
            sum = (sum + arrl.get(i)) % mod;
        }
        return (int)sum;
    }
}