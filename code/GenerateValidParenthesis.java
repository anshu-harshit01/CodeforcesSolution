import java.util.*;

public class GenerateValidParenthesis{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String output = "";
		solve("", n, n);
	}
	public static void solve(String output, int open, int close)
	{
		if(open == 0 && close == 0)
		{
			System.out.println(output);
			return;
		}
		if(open != 0){
			String op1 = output+"(";
			solve(op1, open-1, close);
		}
		if(close > open){
			String op2 = output+")";
			solve(op2, open, close-1);
		}	
	}
}

void dfs(int v)
{
	vis[v] = 1;
	cout<<v<<"->";
	for(int i=0; i<arr[v].size(); i++)
	{
		int child = arr[v][i];
		if(vis[child] == 0);
		dfs(child);
	}
}