import java.util.*;

public class WayTooLongWords{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=Nn; i++)
		{
			String str = sc.nextLine();
			if(str.length() > 10)
			{
				//System.out.println(str.charAt(0)+str.length()-2+str.charAt(length()-1));
				System.out.println(""+str.charAt(0) + (str.length() - 2) + str.charAt(str.length() - 1));

			}
			else{
				System.out.println(str);
			}
		}
	}
}