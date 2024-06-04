import java.util.*;
public class StonesOnTheTable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String color = sc.nextLine();
		int cnt =0;
		for(int i=1; i<color.length(); i++)
		{
			char ch = color.charAt(i-1);
			while(i<color.length() && ch == color.charAt(i))
			{
				cnt++;
				i++;
			}
			//if(cnt != 0)--i;
		}
		System.out.println(cnt);
	}
}