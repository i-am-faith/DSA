import java.util.*;
class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> arrl = new ArrayList<>();
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(mpp.get(nums[i]) == 1)
            {
                arrl.add(nums[i]);
            }
        }
        int[] narr = new int[2];
        narr[0] = arrl.get(0);
        narr[1] = arrl.get(1);

        return narr;
    }
}