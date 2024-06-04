import java.util.*;

public class Football{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int freq = 0;
		int maxFreq = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			while(i<str.length() && str.charAt(i) == ch)
			{
				freq++;
				i++;
			}
			if(freq != 0) --i;
			maxFreq = Math.max(maxFreq, freq);
			freq = 0;

		}
		if(maxFreq >= 7)
		{
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}