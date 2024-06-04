import java.util.Scanner;
public class Watermelon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		isDivideEvenly(weight);
	}
	public static void isDivideEvenly(int weigh)
	{
		if(weigh > 2)
		{
			if(weigh % 2 == 0)
			{
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		else{
			System.out.println("NO");
		}
	}
}