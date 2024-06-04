import java.util.*;
public class PermutationWithSpaces{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String output = "";
		output +=str.charAt(0);
		solve(output, str, 1);
	}
	public static void solve(String output, String input, int indx)
	{
		if(indx == input.length())
		{
			System.out.println(output);
			return;
		}
		String op1 = output+input.charAt(indx);
		String op2 = output+'_'+input.charAt(indx);
		solve(op1, input, indx+1);
		solve(op2, input, indx+1);
	}
}