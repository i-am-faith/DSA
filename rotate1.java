import java.util.*;


public class rotate1{

    static int[] rotateArray(int[] arr, int n) {
        for(int i=0;i<n-1;i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}