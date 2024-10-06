import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> arrp = new ArrayList<>();
        List<Integer> arrn = new ArrayList<>();

        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > 0)
            {
                arrp.add(nums[i]);
            }
            else if(nums[i]<0)
            {
                arrn.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        int pos = 0, neg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = arrp.get(pos);
                pos++;
            } else {
                result[i] = arrn.get(neg);
                neg++;
            }
        }

        return result;
        
    }
}