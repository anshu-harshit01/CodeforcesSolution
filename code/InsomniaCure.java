import java.util.*;

public class InsomniaCure{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();
		int vis[] = new int[d+1];
		int count = 0;
		for(int i=k; i<=d; i+=k)
		{
			if(vis[i] == 0)
			{
				vis[i] = 1;
				count++;
			}
		}
		for(int i=l; i<=d; i+=l)
		{
			if(vis[i] == 0)
			{
				vis[i] = 1;
				count++;
			}
		}
		for(int i=m; i<=d; i+=m)
		{
			if(vis[i] == 0)
			{
				vis[i] = 1;
				count++;
			}
		}
		for(int i=n; i<=d; i+=n)
		{
			if(vis[i] == 0)
			{
				vis[i] = 1;
				count++;
			}
		}
		System.out.println(count);
	}
}