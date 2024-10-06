class Solution {
    public int findComplement(int n) {
        String str = Integer.toBinaryString(n);
        str=str.replace("0","#");
        str=str.replace("1","0");
        str=str.replace("#","1");
        return Integer.parseInt(str,2);
    }
}