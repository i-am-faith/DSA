import java.util.*;
public class union {
    public static List< Integer > sortedArray(int []a, int []b) {
        int n = a.length;
        int m = b.length;
        int i=0,j=0;
        List<Integer> union = new ArrayList<>();
        while(i<n && j<m)
        {
            if(a[i] < b[j])
            {
                if(union.isEmpty() || union.get(union.size()-1) != a[i])
                {
                    union.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j])
            {
                if(union.isEmpty() || union.get(union.size()-1) != b[j])
                {
                    union.add(b[j]);
                }
                j++;
            }
            else
            {
                if(union.isEmpty() || union.get(union.size()-1) != a[i])
                {
                    union.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if(union.isEmpty() || union.get(union.size()-1) != a[i])
            {
                union.add(a[i]);
            }
            i++;
        }
        while(j<m)
        {
            if(union.isEmpty() || union.get(union.size()-1) != b[j])
            {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}