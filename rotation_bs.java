public class Solution {
    public static int findKRotation(int []arr){
    int low = 0;
    int high = arr.length-1;
    int mini = Integer.MAX_VALUE;
    int mindex = 0;

    //find minimum
    while(low <= high)
    {
        int mid = low + (high - low)/2;
        //left sorted array
        if(arr[low] <= arr[mid])
        {
            if(arr[low] < mini) {
                mini = arr[low];
                mindex = low;
            }
            low = mid+1;
        }
        //right sorted array
        else
        {
            if(arr[mid] < mini) {
                mini = arr[mid];
                mindex = mid;
            }
            high = mid-1;
        }
    }

    return mindex;
    }
}