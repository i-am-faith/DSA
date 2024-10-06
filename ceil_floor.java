import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int low = 0, high = n-1;
      int[] arr = new int[2];
      arr[0] = -1;
      arr[1] = -1;
      while(low <= high)
      {
          int mid = low + (high - low)/2;
          if(a[mid] <= x)
          {
            arr[0] = a[mid];
            low = mid+1;
          }
          else
          {
            high = mid-1;
          }
      }
      low = 0;
      high = n-1;
      while(low <= high)
      {
          int mid = low + (high - low)/2;
          if(a[mid] >= x)
          {
            arr[1] = a[mid];
            high = mid-1;
          }
          else
          {
            low = mid+1;
          }
      }
      return arr;
    }
    
}