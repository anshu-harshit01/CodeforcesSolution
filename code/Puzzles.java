import java.util.*;
public class Puzzles{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		int nums[] = new int[m];
		for(int i=0; i<m; i++)
		{
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);
		
		int minDiff = nums[m-1]-nums[0];
		for(int i=1; i<=m-n; i++)
		{
			if(nums[n+i-1] - nums[i] < minDiff){
				minDiff = nums[i+n-1] - nums[i];
			}
		}
		System.out.println(minDiff);
	}
}