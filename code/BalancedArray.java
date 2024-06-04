import java.util.Scanner;
public class BalancedArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int j=0; j<t; j++)
		{
			int n = sc.nextInt();

		if((n/2)%2!= 0){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
			
		int arr[] = new int[n];
		int even = 2;
		for(int i=0; i<n/2; i++)
		{
			arr[i] = even;
			even+=2;
		}
		int odd = 1;
		for(int i=n/2; i<n-1; i++)
		{
			arr[i] = odd;
			odd+=2;
		}
		arr[n-1] = arr[(n/2)-1] + ((n/2)-1);

		for(int val : arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		}
		}
	}
}