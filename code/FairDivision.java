import java.util.*;
public class FairDivision{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0; i<testcases; i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int k=0; k<n; k++)
			{
				arr[k] = sc.nextInt();
			}
			int alice =0, bob=0;

			Arrays.sort(arr);
			for(int j=n-1; j>=0; j--)
			{
				if(alice <= bob)
				{
					alice+= arr[j];
				}
				else{
					bob+= arr[j];
				}
			}
			if(alice == bob){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}