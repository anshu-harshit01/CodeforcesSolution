import java.util.*;

public class EvenOdds{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		long a, b;
		a = k*2 -1;

		if(a > n)
		{
			if(n%2 == 0){
				b=n/2;
			}
			else{
				b=(n/2)+1;
			}
			k = k-b;
			a = k*2;
			System.out.println(a);
			return;
		}
		System.out.println(a);
	}
}