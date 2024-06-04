import java.util.*;
public class CalculateSizeOfSubTree{
	
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
		int subSize[] = new int[nodes+1];
		int totalNodes = dfs(1, adj, vis, subSize);
		for(Integer val : subSize)
		{
			System.out.print(val+" ");
		}

	}
	static int dfs(int currNode, ArrayList<ArrayList<Integer>> adj, boolean vis[], int subSize[])
	{
		vis[currNode] = true;
		int curr_size = 1;
		for(int neigh: adj.get(currNode))
		{
			if(!vis[neigh]){
				
				curr_size += dfs(neigh, adj, vis, subSize);
			}
		}
		subSize[currNode] = curr_size;
		return curr_size;
	}
}