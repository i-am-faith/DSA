class missing_number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        //nijeder modhdhe Xoring
        for(int i=0;i<=n;i++)
        {
            ans = ans ^ i;
        }
        //given array er element er saathe Xoring
        for(int i=0;i<n;i++)
        {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
