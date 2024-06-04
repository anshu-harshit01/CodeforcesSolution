import java.util.*;
public class ANtonAndDanik{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String games = sc.nextLine();

		int countA = 0, countD = 0;
		for(int i=0; i<games.length(); i++)
		{
			char ch = games.charAt(i);
			if(ch == 'A'){
				countA++;
			}else{
				countD++;
			}
		}
		if(countA > countD){
			System.out.println("Anton");
		}
		else if(countA < countD){
			System.out.println("Danik");
		}
		else{
			System.out.println("Friendship");
		}
	}
}