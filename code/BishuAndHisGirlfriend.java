import java.util.*;
public class BishuAndHisGirlfriend{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int countries = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for(int i=0; i<=countries; i++)//for nodes (1 to n)
		{
			adj.add(new ArrayList<>());
		} 
		for(int i=1; i<countries; i++)//for edges (till n-1)
		{
			int u = sc.nextInt(); 
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}

		boolean vis[] = new boolean[countries+1];
		int distance[] = new int[countries+1];

		dfs(1, vis, distance, adj, 0);

		int girls = sc.nextInt();
		int minDist = Integer.MAX_VALUE;
		int ans = -1;
		for(int i=0; i<girls; i++)
		{
			int girl_city = sc.nextInt();
			if(distance[girl_city] < minDist)
			{
				minDist = distance[girl_city];
				ans = girl_city;
			}
			else{
				if(distance[girl_city] == minDist && girl_city < ans)
				{
					ans = girl_city;
				}
			}
		}
		System.out.println("The ans is " +ans);

	}
	public static void dfs(int source, boolean vis[], int distance[], ArrayList<ArrayList<Integer>> adj, int dist)
	{
		vis[source] = true;
		distance[source] = dist;
		for(int neigh : adj.get(source))
		{
			if(!vis[neigh])
			{
				dfs(neigh, vis, distance, adj, distance[source]+1);
			}
		}
	}
}