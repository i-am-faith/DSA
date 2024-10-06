import java.util.*;
class Solution {
    public void merge(int[] nums,int l , int mid , int r)
    {
        int left = l;
        int right = mid+1;
        List<Integer> arrl = new ArrayList<>();
        while(left<=mid && right<=r)
        {
            if(nums[left]<nums[right])
            {
                arrl.add(nums[left]);
                left++;
            }
            else
            {
                arrl.add(nums[right]);
                right++;
            }
        }
        while(left <= mid)
        {
            arrl.add(nums[left]);
            left++;
        }
        while(right <= r)
        {
            arrl.add(nums[right]);
            right++;
        }
        for(int i=l;i<=r;i++)
        {
            nums[i] = arrl.get(i-l);
        }
    }
    public void mergesort(int[] nums, int l , int r)
    {
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        mergesort(nums,l,r);
        return nums;
    }
}