import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        Map<String,Integer> mpp = new HashMap<>();
        List<String> arrl = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            if(mpp.get(arr[i]) == 1)
            {
                boolean isdistinct = true;
                for(int j=0;j<arrl.size();j++)
                {
                    if(arrl.get(j).equals(arr[i]))
                    {
                        isdistinct = false;
                        break;
                    }
                }
                if(isdistinct)
                {
                    arrl.add(arr[i]);
                }
            }
            
        }

        if(k<= arrl.size())
        {
            return arrl.get(k-1);
        }
        return "";

        
    }
}