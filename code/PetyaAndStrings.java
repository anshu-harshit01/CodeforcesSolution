import java.util.Scanner;

public class PetyaAndStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		for(int i=0; i<str1.length(); i++)
		{
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);

			if(ch1 >= 'A' && ch1 <= 'Z')
			{
				ch1 = (char)(ch1 + 32);
			}
			if(ch2 >= 'A' && ch2 <= 'Z')
			{
				ch2 = (char)(ch2 + 32);
			}
			if(ch1 > ch2)
			{
				System.out.println("1");
				return;
			}
			else if(ch1 < ch2){
				System.out.println("-1");
				return;
			}
		}
		System.out.println("0");
	}
}