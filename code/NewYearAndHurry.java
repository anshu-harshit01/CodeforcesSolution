import java.util.Scanner;

public class NewYearAndHurry{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int timeTotravel = sc.nextInt();

		int totalTime = 240;

		int timeLeft = totalTime - timeTotravel;

		int count = 0;

		for(int i=1; i<=n; i++)
		{
			if(timeLeft >= 5*i)
			{
				count++;
				timeLeft -= 5*i;
			}
			else{
				break;
			}
		}
		System.out.println(count);
	}
}