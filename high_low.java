import java.util.*;
public class high_low {
    public static int[] getFrequencies(int []v) {
        //Hashmap Created
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<v.length;i++)
        {
            mpp.put(v[i],mpp.getOrDefault(v[i], 0)+1);
        }

        int maxfreq = Integer.MIN_VALUE;
        int minfreq = Integer.MAX_VALUE;
        int maxfreqelm = -1;
        int minfreqelm = -1;

        for(int i=0;i<v.length;i++)
        {
            int freq = mpp.get(v[i]);
            if(freq > maxfreq)
            {
                maxfreq = freq;
                maxfreqelm = v[i];
            }
            if(freq == maxfreq)
            {
                maxfreqelm = Math.min(maxfreqelm,v[i]);
            }
        }

        for(int i=0;i<v.length;i++)
        {
            int freq = mpp.get(v[i]);
            if(freq < minfreq)
            {
                minfreq = freq;
                minfreqelm = v[i];
            }
            if(freq == minfreq)
            {
                minfreqelm = Math.min(minfreqelm,v[i]);
            }
        }

        int[] op = new int[2];
        op[0] = maxfreqelm;
        op[1] = minfreqelm;
        return op;

    }
}