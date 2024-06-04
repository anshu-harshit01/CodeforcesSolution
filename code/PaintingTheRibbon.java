import java.util.Scanner;
public class PaintingTheRibbon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		for(int i=0; i<testcases; i++)
		{
			int n = sc.nextInt(); int m=sc.nextInt(); int k=sc.nextInt();
			if(n == 1 || m == 1)
			{
				System.out.println("NO");
			}
			else{
				int same = n/m;
			    if(n%m != 0) same++;
			    int diff = n -same;
			    if(diff <= k)
			    {
				    System.out.println("NO");
			    }
			    else{
				    System.out.println("YES");
			    }
			}
			
		}
	}
}