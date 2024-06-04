import java.util.*;
public class StepsToABecomeB{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for(int i=0; i<testcases; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			int diff = Math.abs(a-b);
			int moves = diff / 10;
			if(diff % 10 != 0){
				moves++;
			}
			System.out.println(moves);
		}
	}
}