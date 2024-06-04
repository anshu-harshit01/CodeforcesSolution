import java.util.*;
public class DualTrigger{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		 //sc.nextLine(); // Consume newline

		for(int k=0; k<testcases; k++)
		{
			int len = sc.nextInt();
			sc.nextLine();//consume newline character
			String str = sc.nextLine();
			boolean isLeft = false;
			boolean isRight = false;
			
			int i=0, j = str.length()-1;
			boolean isPossible = false;
			while(i < j-1)
			{
				while(str.charAt(i) != '1' && i<j-1)
				{
					i++;
				}
				if(str.charAt(i) =='1') isLeft = true;

				while(str.charAt(j) != '1' && i<j-1)
				{
					j--;
				}
				if(str.charAt(j) == '1') isRight = true;
				//isPossible = isLeft && isRight;
				 if (isLeft && isRight) {
                    isPossible = true;
                    break; // Exit the loop once both sides are found
                }
			}

			System.out.println(isPossible);
		}
	}
}