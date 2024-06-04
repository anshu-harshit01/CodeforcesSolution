import java.util.*;
public class Sale{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tvSale[] = new int[n];
		for(int i=0; i<n; i++){
			tvSale[i] = sc.nextInt();
		}
		int profit = 0;
		Arrays.sort(tvSale);
		for(int i=0; i<n; i++)
		{
			if(m > 0 && tvSale[i] < 0)
			{
				profit+=Math.abs(tvSale[i]);
				m--;
			}
		}
		System.out.println(profit);
	}
}