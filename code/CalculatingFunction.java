import java.util.*;

public class CalculatingFunction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long evenNumbers = n/2;
		long oddNumbers = n/2;
		if(n%2 != 0)
		{
			oddNumbers++;
		}
		long sumOfEven = evenNumbers*(evenNumbers+1);
		long sumOfOdd = oddNumbers*oddNumbers;
		System.out.println(sumOfEven - sumOfOdd);
	}
	
}