import java.util.*;

public class HolidayOfEquality{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int expenses = 0;

		int maxHold = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] > maxHold){
				maxHold = arr[i];
			}
		}

		for(int i=0; i<n; i++)
		{
			expenses += maxHold - arr[i];
		}
		System.out.println(expenses);
	}
}