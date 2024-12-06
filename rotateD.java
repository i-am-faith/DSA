import java.util.*;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> res = new ArrayList<>();
        //Store Right Elements
        for(int i=k;i<n;i++)
        {
            res.add(arr.get(i));
        }

        //Store Left Elements
        for(int i=0;i<k;i++)
        {
            res.add(arr.get(i));
        }

        return res;
    }
}