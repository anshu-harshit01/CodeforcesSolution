import java.util.*;
public class diameterOfTree{
	
	static int maxDiameter = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<= nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=0; i<nodes-1; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		boolean vis[] = new boolean[nodes+1];
		System.out.println("Choose a starting point: ");
		int src = sc.nextInt();
		int maxDia = dfs(src, adj, 0, vis);

		System.out.println("The Longest Diameter of tree is "+maxDia);
		
	}
	static int dfs(int src, ArrayList<ArrayList<Integer>> adj, int diameter, boolean vis[])
	{
		vis[src] = true;
		
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				maxDiameter = dfs(neigh, adj, diameter+1, vis);
				return maxDiameter;
			}
		}
		maxDiameter = Math.max(maxDiameter, diameter);
		return maxDiameter;
	}
}