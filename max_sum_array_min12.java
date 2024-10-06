class Solution {

    public static long pairWithMaxSum(long arr[], long N) {
        long sum = 0;
        long maxi = Long.MIN_VALUE;
        for(int i=0;i<N-1;i++)
        {
            sum = arr[i] + arr[i+1];
            maxi = Math.max(maxi,sum);
        }
        return maxi;
    }
}