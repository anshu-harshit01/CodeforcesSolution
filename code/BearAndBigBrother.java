import java.util.Scanner;
public class BearAndBigBrother{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int yrs = 0;

		while(true)
		{
			a = a*3;
			b = b*2;

			yrs++;

			if(a>b){
				System.out.println(yrs);
				return;
			}
		}
	}
}