import java.util.*;

public class VasyaAndSocks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int socks = sc.nextInt();
		int m = sc.nextInt();

		int days = 0;
		while(true)
		{
			days++;
			socks--;

			if(days % m == 0){
				socks++;
			}
			if(socks == 0){
				System.out.println(days);
				return;
			}

		}
	}
}