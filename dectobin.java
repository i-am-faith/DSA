class Solution{
	void toBinary(int N) {
		long dec = N;
		long bin = 0;
		long base = 1;
		while(dec > 0)
		{
		    long rem = dec % 2;
		    bin = bin + rem * base;
		    dec/=2;
		    base*=10;
		}
		System.out.print(bin);
	}
}