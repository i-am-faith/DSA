public class second_largest {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        // Find the largest and second largest elements
        for(int i=0; i<n; i++) {
            if(a[i] > max) {
                max2 = max;
                max = a[i];
            } else if(a[i] > max2 && a[i] < max) {
                max2 = a[i];
            }
        }

        // Find the smallest and second smallest elements
        for(int i=0; i<n; i++) {
            if(a[i] < min) {
                min2 = min;
                min = a[i];
            } else if(a[i] < min2 && a[i] > min) {
                min2 = a[i];
            }
        }
        
        // Handle cases where there is no second largest or second smallest element
        if(max2 == Integer.MIN_VALUE) max2 = -1;
        if(min2 == Integer.MAX_VALUE) min2 = -1;

        int[] arr = new int[2];
        arr[0] = max2;
        arr[1] = min2;
        return arr;
    }
}

