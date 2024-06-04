import java.util.Scanner;

public class Team{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int problems = sc.nextInt();
		int solution = 0;
		for(int i=0; i<problems; i++)
		{
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();

			if((m1 + m2 + m3) >= 2){
				solution++;
			}
		}
		System.out.println(solution);
	}
}