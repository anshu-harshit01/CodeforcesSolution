import java.util.*;
public class LongestPathInATree{
	static int candidate;
	//static int maxDist;
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
		candidate = 0;
		//maxDist = -1;
		boolean vis[] = new boolean[nodes+1];
		int maxDist = dfs(1, adj, vis, 0, -1);

		for(int i=0; i<nodes+1; i++){
			vis[i] = false;
		}
		//maxDist = -1;
		int ans = dfs(candidate, adj, vis, 0, -1);
		System.out.println("The root of the longest path is : "+candidate);
		System.out.println("and longest path is of length : "+ans);
	}
	static int dfs(int currNode, ArrayList<ArrayList<Integer>> adj, boolean vis[], int dist, int maxDist)
	{
		vis[currNode] = true;
		if(dist> maxDist)
		{
			maxDist = dist;
			candidate = currNode;
		}
		for(int neigh: adj.get(currNode))
		{
			if(!vis[neigh]){
				return dfs(neigh, adj, vis, dist+1, maxDist);
			}
		}
		return maxDist;
	}
}