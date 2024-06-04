import java.util.*;
public class KefaAndFirstSteps{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int days[] = new int[n];
		for(int i=0; i<n; i++)
		{
			days[i] = sc.nextInt();
		}
		int ans = 1;
		int maxAns = 1;
		for(int i=1; i<n; i++)
		{
			if(days[i-1] <= days[i]){
				ans++;
			}
			else{
				
				ans = 1;
			}
			maxAns = Math.max(maxAns, ans);
		}
		System.out.println(maxAns);
	}
}