public class sorted_check {
    public static int isSorted(int n, int []a) {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[i+1])
                {
                    return 0;
                }
            }
        }
        return 1;
    }
}
