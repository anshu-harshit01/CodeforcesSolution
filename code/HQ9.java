import java.util.Scanner;
public class HQ9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char ch1 = 'H';
		char ch2 = 'Q';
		char ch3 = '9';

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == ch1 || ch == ch2 || ch == ch3){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}