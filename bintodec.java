class Solution {
    public int binary_to_decimal(String str) {
        long bin = Long.parseLong(str);
        long dec = 0;
        long base = 1;
        
        while(bin > 0)
        {
            long rem = bin %10;
            dec = dec + rem * base;
            bin /= 10;
            base *= 2;
        }
        
        return (int) dec;
    }
}