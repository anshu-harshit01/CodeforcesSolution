import java.util.Scanner;
public class Elephant{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dist = sc.nextInt();
		if(dist>=1 && dist <=5){
			System.out.println("1");
			return;
		}
		int steps = 0;
		while(dist > 0)
		{
			if(dist > 5)
			{
				dist -= 5;
				steps++;
			}
			else{
				steps++;
				dist-=dist;
			}
		}
		System.out.println(steps);
	}
}