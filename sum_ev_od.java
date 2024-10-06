import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evsum = 0;
		int odsum = 0;
		while(n>0)
		{
			int rem = n%10;
			if(rem % 2 == 0)
			{
				evsum += rem;
			}
			else
			{
				odsum += rem;
			}
			n/=10;
		}
		System.out.print(evsum + " " + odsum);
	}
}
