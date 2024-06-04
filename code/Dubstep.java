import java.util.*;
public class Dubstep{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "WUB";
		int j =0;
		String song = sc.nextLine();
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<song.length(); i++)
		{
			ans.append(song.charAt(i));
			if(j<str.length() && str.charAt(j) == song.charAt(i)){
				j++;
			}
			else{
				j=0;
			}
			if(j==str.length())
			{
				if(ans.length()>= 3)
				    ans.setLength(ans.length()-3);
				if(ans.length()!=0)
					ans.append(" ");
				j=0;
			}
			
		}
		if(ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ')
		    ans.setLength(ans.length()-1);
		System.out.println(ans.toString());
	}
}