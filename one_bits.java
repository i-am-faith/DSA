class Solution {
    public int hammingWeight(int n) {
        long dec = n;
        long bin = 0;
        long base = 1;
        int count = 0;
        while(dec > 0)
        {
            long rem = dec % 2;
            if(rem == 1)
            {
                count++;
            }
            bin = bin + rem * base;
            dec /= 2;
            base *= 10;
        }

        return count;
    }
}