import java.util.*;
public class OddDivisor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0; i<testcases; i++)
		{
			long n = sc.nextLong();
			boolean flag = isDivisorExist(n);
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	public static boolean isDivisorExist(long n)
	{
		if((n&(n-1)) == 0){
			return false;
		}
		return true;
	}
}