import java.util.*;
public class BipartiteGraph{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int nodes = sc.nextInt();
		for(int i=0; i<=nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=0; i<nodes; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		boolean vis[] = new boolean[nodes+1];
		int col[] = new int[nodes+1];
		Arrays.fill(col, -1);
		boolean isBipartite = dfs(adj, vis, col, 0, 1);
		if(isBipartite == true)
		System.out.println("Given graph is a BipartiteGraph");
		else System.out.println("Given graph is NOT a BipartiteGraph");
	}
	static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int col[], int color, int src)
	{
		vis[src] = true;
		col[src] = color;
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				if(dfs(adj, vis, col, color^1, neigh) == false)
					return false;
			}
			else if(col[src] == col[neigh])
				return false;
		}
		return true;
	}
}