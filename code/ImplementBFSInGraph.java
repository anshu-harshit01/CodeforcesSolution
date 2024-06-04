import java.util.*;
public class ImplementBFSInGraph{
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
		int dist[] = new int[nodes+1];
		//dfs(3, adj, vis, dist, 0);
		bfs(3, adj, vis, dist);
		for(int i=1; i<dist.length; i++)
		{
			System.out.print(dist[i]+" ");
		}
	}
	static void bfs(int src, ArrayList<ArrayList<Integer>> adj, boolean vis[], int dist[])
	{
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(src);
		vis[src]= true;
		dist[src] = 0;
		while(!queue.isEmpty())
		{
			int curr = queue.poll();
			
			for(int child : adj.get(curr))
			{
				if(!vis[child]){
					queue.add(child);
			        dist[child] = dist[curr]+1;
			        vis[child] = true;
				}
			}
		}
	}
}