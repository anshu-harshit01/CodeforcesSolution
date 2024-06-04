import java.util.*;
public class CaseChange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word in smallcase");
		String str = sc.nextLine();
		String output = "";
		solve(output, str, 0);
	}
	public static void solve(String output, String input, int indx)
	{
		if(indx == input.length())
		{
			System.out.println(output);
			return;
		}
		String op1 = output+input.charAt(indx);
		//String op2 = output+(char)((input.charAt(indx)+32));
		String op2 = output + Character.toUpperCase(input.charAt(indx));
		solve(op1, input, indx+1);
		solve(op2, input, indx+1);
	}
}