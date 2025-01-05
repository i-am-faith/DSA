import java.util.* ;
import java.io.*; 

public class Solution {
	public static boolean checkEvenPartitioning(int n) {
		if(n == 2)
		{
			return false;
		}
		else if(n % 2 == 0)
		{
			return true;
		}
		return false;
	}
}
