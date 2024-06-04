import java.util.*;

public class TwinsDist{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int coins[] = new int[n];
		for(int i=0; i<n; i++)
		{
			coins[i] = sc.nextInt();
		}

		int count = distributeCoin(coins, n);
		System.out.println(count);
	}
	public static int distributeCoin(int arr[], int n)
	{
		Arrays.sort(arr);
		int twinCoin = 0;
		int sum = 0;
		int coins = 0;

		for(int i=0; i<n; i++)
		{
			twinCoin += arr[i];
		}
		for(int i=n-1; i>=0; i--)
		{
			sum += arr[i];
			twinCoin -= arr[i];
			coins++;
			if(sum > twinCoin)
			{
				return coins++;
			}
		}
		return n;
	}
}