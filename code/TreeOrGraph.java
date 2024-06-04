import java.util.*;
public class TreeOrGraph{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int nodes = sc.nextInt();
		for(int i=0; i<=nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		int edges = 0;
		for(int i=1; i<nodes; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		int cc =0;
		boolean vis[] = new boolean[nodes+1];
		for (int i=1; i<=nodes; i++)
		{
			if(!vis[i]){
				dfs(adj, i, vis);
				cc++;
			}
		}
		for (int i = 1; i <= nodes; i++)
		{
            edges += adj.get(i).size();
        }
        edges /= 2; 

		if(cc == 1 && nodes-1 == edges)
		{
			System.out.println("Hurrah, It's a tree.");
		}
		else{
			System.out.println("Sorry, It's a graph.");
		}
	}
	static void dfs(ArrayList<ArrayList<Integer>> adj, int src, boolean vis[])
	{
		vis[src] = true;
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				dfs(adj, neigh, vis);
			}
		}
	}
}