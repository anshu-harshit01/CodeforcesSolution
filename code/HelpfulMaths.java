import java.util.Scanner;
public class HelpfulMaths{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		int ones = 0;
		int twos = 0;
		int threes = 0;

		for(int i=0; i<expression.length(); i++)
		{
			char ch = expression.charAt(i);
			if(ch == '1'){
				ones++;
			}
			else if(ch == '2'){
				twos++;
			}
			else if(ch == '3'){
				threes++;
			}
		}
		StringBuilder sb = new StringBuilder();
		while(ones > 0)
		{
			sb.append('1');
			sb.append('+');
			ones--;
		}
		while(twos > 0)
		{
			sb.append('2');
			sb.append('+');
			twos--;
		}
		while(threes > 0)
		{
			sb.append('3');
			sb.append('+');
			threes--;
		}
		if (sb.length() > 0)
		{
            sb.setLength(sb.length() - 1);
        }
		System.out.println(sb.toString());
	}
}