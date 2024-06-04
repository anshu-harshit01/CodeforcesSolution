import java.util.*;
public class CycleDetectionInGraph{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<=nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=0; i<edges; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		boolean vis[] = new boolean[nodes+1];
		boolean isCyclePresent = dfs(1, adj, vis, -1);

		if(isCyclePresent){
			System.out.println("Cycle is present");
			return;
		}
		else System.out.println("No cycle is found");
	}
	public static boolean dfs(int src, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent)
	{
		vis[src] = true;
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				if(dfs(neigh, adj, vis, src) == true)
					return true;
			}
			else{
				if(neigh != parent) //mtlb visited to hai lekin wo source nhi hai iska mtlb cycle present hai.
					return true;
			}
		}
		return false;
	}
}