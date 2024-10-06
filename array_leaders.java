class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> arrl = new ArrayList<>();
        int maxi = arr[n-1];
        arrl.add(maxi);
        for(int j=n-2;j>=0;j--)
        {
            if(arr[j] >= maxi)
            {
                arrl.add(arr[j]);
                maxi = arr[j];
            }
        }
        Collections.reverse(arrl);
        return arrl;
    }
}
