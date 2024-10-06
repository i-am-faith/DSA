import java.util.* ;
import java.io.*; 

public class insertion_sort {

	public static void insertionSort(int n , int[] arr) {
		for(int i=1;i<n;i++)
		{
			int curr = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>=curr)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = curr;
		}
	}
}

