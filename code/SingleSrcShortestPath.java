import java.util.*;

public class SingleSrcShortestPath{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i=0; i<=nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=0; i<edges; i++)
		{
			int u = sc.nextInt(), v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		boolean vis[] = new boolean[nodes+1];
		int dist[] = new int[nodes+1];
		int src = 1, curr = 0;
		dfs(src, adj, vis, dist, curr);
		System.out.println("Enter the node whose distance you want: ");
		int inp = sc.nextInt();
		System.out.println("The distance is - "+dist[inp]);
	}
	public static void dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean vis[], int dist[], int curr)
	{
		vis[src] = true;
		dist[src] = curr;
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				dfs(neigh, adj, vis, dist, dist[src]+1);
			}
		}
	}
}