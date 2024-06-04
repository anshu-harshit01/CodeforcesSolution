import java.util.Scanner;
public class GCD{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = solveGCD(a,b);
		System.out.println("The GCD of "+a+" and "+b+" is " +ans);
	}
	static int solveGCD(int div, int rem)
	{
		if(rem == 0)
			return div;
		return solveGCD(rem, div%rem);
	}
}