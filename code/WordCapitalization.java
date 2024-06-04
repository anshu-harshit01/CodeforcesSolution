import java.util.*;

public class WordCapitalization{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
			sb.append(str.charAt(0));
		}
		else{
			sb.append((char)(str.charAt(0) - 32));
		}

		for(int i=1; i<str.length(); i++)
		{
			char ch = str.charAt(i);

			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
}