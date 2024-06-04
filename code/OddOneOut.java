import java.util.Scanner;
public class OddOneOut{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i=0; i<testcases; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if((a&b)==a && (a&b)==b){
				System.out.println(c);
			}
			else if((a&c)==c && (a&c)==a){
				System.out.println(b);
			}
			else{
				System.out.println(a);
			}
		}
	}
}