import java.util.Scanner;
public class Bits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // Consume newline character
		int ans = 0;

		for(int i=0; i<n; i++)
		{
			String statement = sc.nextLine().trim();
			if(!statement.isEmpty())
			{
				int len = statement.length();
			    if(statement.charAt(0) == '+' || statement.charAt(len-1) == '+')
			    {
				    ++ans;
			    }
			    else if(statement.charAt(0) == '-' || statement.charAt(len-1) == '-'){
				    --ans;
			    }
			}
		}
		System.out.println(ans);
	}
}