import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{	private static void reverse(ArrayList<Integer> arr, int left , int right)
	{
		while(left < right)
		{
			Collections.swap(arr,left,right);
			left++;
			right--;
		}
	}
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		int n = arr.size();
		int pivot = -1;

		//Find Pivot
		for(int i=n-2;i>=0;i--)
		{
			if(arr.get(i) < arr.get(i+1))
			{
				pivot = i;
				break;
			}
		}

		//Edge Case : Last permutation to First
		if(pivot == -1)
		{
			Collections.reverse(arr);
			return arr;
		}

		//Next Pivot
		for(int i=n-1;i>pivot;i--)
		{
			if(arr.get(i) > arr.get(pivot))
			{
				Collections.swap(arr,i,pivot);
				break;
			}
		}

		//Reverse pivot + 1 with n-1
		reverse(arr,pivot+1,n-1);
		return arr;
	}
}
