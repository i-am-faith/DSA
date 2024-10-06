import java.util.Arrays;

public class remove_duplicates {
    public static int removeDuplicates(int[] arr,int n) {
        int count = n;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] == arr[i+1])
            {
                count--;
            }
        }
        return count;
    }
}
