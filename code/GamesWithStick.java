import java.util.*;

public class GamesWithStick{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int totalIntersection = n*m;
		
		boolean aTurn = true;
		boolean mTurn = false;
		while(true)
		{
			//akshat turn

			if(aTurn)
			{
				aTurn = false;
				mTurn = true;

				if(totalIntersection != 0)
				{
					totalIntersection -= (m+n-1);
					m--;
					n--;
				}
				else{
					System.out.println("Malvika");
					return;
				}
			}
			else if(mTurn)
			{
				aTurn = true;
				mTurn = false;

				if(totalIntersection != 0)
				{
					totalIntersection -= (m+n-1);
					m--;
					n--;
				}
				else{
					System.out.println("Akshat");
					return;
				}
			}
		}
	}
}