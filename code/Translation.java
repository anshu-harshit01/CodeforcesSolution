import java.util.*;
public class Translation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		boolean isTru = isTReverseOfS(s,t);
		if(isTru){
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
	public static boolean isTReverseOfS(String s, String t)
	{
		int i=0;
		int j = t.length()-1;

		while(i<s.length())
		{
			if(s.charAt(i) != t.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}