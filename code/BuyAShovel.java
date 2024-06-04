import java.util.*;
public class BuyAShovel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();

		int ans = solve(k, r, 1);
		System.out.println(ans);
	}
	public static int solve(int k, int r, int count)
	{
		while(true)
		{
			if((count*k)%10 == r || (count*k)%10 == 0)
			{
				return count;
			}
			else{
				count++;
			}
		}
	}
}