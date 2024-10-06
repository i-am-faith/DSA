import java.util.*;

public class merge_sort {
    public static void merge(int[] arr, int l, int mid, int r)
    {
        int left = l;
        int right = mid+1;
        List<Integer> arrl = new ArrayList<>();
        while(left<=mid && right<=r)
        {
            if(arr[left]<arr[right])
            {
                arrl.add(arr[left]);
                left++;
            }
            else
            {
                arrl.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            arrl.add(arr[left]);
            left++;
        }
        while(right<=r)
        {
            arrl.add(arr[right]);
            right++;
        }

        for(int i=l;i<=r;i++)
        {
            arr[i] = arrl.get(i-l);
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
}


