import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] giftsLeft(int n, int k, int q, int[] demands) {
        int[] arr = new int[q];
        int total = n;
        
        for(int i = 0; i < q; i++) {
            if(demands[i] > n)
			{
				arr[i] = -1;
			} 
            else
			{
				int sub = n - demands[i];
				n -= demands[i];
				if(n < k)
				{
					n = total;
				}
				arr[i] = n;
			}
        }
        return arr;
    }
}
