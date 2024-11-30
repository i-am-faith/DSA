import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n = arr.size();
        int start = m+1;
        int end = n-1;

        while(start <= end)
        {
            Collections.swap(arr,start,end);
            start++;
            end--;
        }
    }
}
