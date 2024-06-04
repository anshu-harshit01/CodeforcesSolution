import java.util.*;
public class InAndOutTimesOfNodes{
	static boolean[] vis;
	static int[] inTimes;
	static int[] outTimes;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<= nodes; i++)
		{
			adj.add(new ArrayList<>());
		}
		for(int i=1; i<nodes; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		inTimes = new int[nodes+1];
		outTimes = new int[nodes+1];
		vis = new boolean[nodes+1];
		dfs(1, adj, 1);

		System.out.println("Enter a node: ");
		int child = sc.nextInt();
		System.out.println("Enter a subtree's root: ");
		int subRoot = sc.nextInt();

		if(inTimes[child] > inTimes[subRoot])
		{
			System.out.println("Node "+curr+" lies in the subtree of "+sub);
		}
		else{
			System.out.println("Node "+curr+" doesn't lies in the subtree of "+sub);
		}
	}
	static void dfs(int src, ArrayList<ArrayList<Integer>> adj, int timer)
	{
		vis[src] = true;
		inTimes[src] = timer++;
		for(int neigh : adj.get(src))
		{
			if(!vis[neigh])
			{
				dfs(neigh, adj, timer);
			}
		}
		outTimes[src] = timer++;
	}
}