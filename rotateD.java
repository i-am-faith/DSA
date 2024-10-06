import java.util.*;

public class rotateD {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int d = k % n;
        if(d == 0) return arr;
        List<Integer> temp = new ArrayList<>(d);
        //adding eleemnts upto d into temp
        for(int i=0;i<d;i++)
        {
            temp.add(arr.get(i));
        }
        //shifting last element to first
        for(int i=d;i<n;i++)
        {
            arr.set(i-d, arr.get(i));
        }
        //shifting first element to last
        for(int i=0;i<d;i++)
        {
            arr.set(n-d+i, temp.get(i));
        }
        return arr;
    }
}


