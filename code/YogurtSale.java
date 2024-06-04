import java.util.*;
public class YogurtSale{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for(int i=0; i<testcases; i++)
		{
			int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int cost = 0;

		    while(n > 0)
		    {
		    	if(n>=2 && b<2*a)
		    	{
		    		cost += b;
		    		n-=2;
		    	}
		    	else{
		    		cost += a;
		    		n--;
		    	}
		    }
		    System.out.println(cost);
		}	
	}
}