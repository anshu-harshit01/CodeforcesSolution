import java.util.*;
public class Pangram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		boolean vis[]= new boolean[26];
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(isCapital(ch))
			{
				vis[ch-'A'] = true;
			}
			else{
				vis[ch-'a'] = true;
			}
		}
		for(int i=0; i<26; i++)
		{
			if(!vis[i]){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	public static boolean isCapital(char ch)
	{
		if(ch>= 65 && ch<=90) return true;
		return false;
	}
}