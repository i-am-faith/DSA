import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(arr[i]);
        }

        int pos = 1;
        while(st.contains(pos))
        {
            pos++;
        }
        return pos;
	}
}
