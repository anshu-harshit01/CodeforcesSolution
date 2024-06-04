import java.util.*;
public class printSubsets{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		String out = "";
		//int indx = 0;
		HashSet<String> set = new HashSet<>();
		solve(inp, out, 0, set);
	}
	public static void solve(String input, String output, int indx, HashSet<String>set)
	{
		if(indx == input.length())
		{
			if(!set.contains(output)){
				set.add(output);
				System.out.println(output);
			}
			return;
		}
		String op1 = output;
		String op2 = output + input.charAt(indx);

		solve(input, op1, indx+1, set);
		solve(input, op2, indx+1, set);
	}
}