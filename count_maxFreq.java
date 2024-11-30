class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int max = 0 , sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        //finding max frequency
        Set<Integer> keys = mpp.keySet();
        for(int i : keys)
        {
            max = Math.max(max,mpp.get(i));
        }

        //max equal
        for(int i : keys)
        {
            if(max == mpp.get(i))
            {
                sum += mpp.get(i);
            }
        }

        return sum;
    }
}