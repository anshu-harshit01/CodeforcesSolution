import java.util.*;
public class WordInversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int countL=0, countU=0;
		for(int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(ch>='a' && ch<='z') countL++;
			else countU++;
		}
		if(countL > countU || countL == countU){
			System.out.println(input.toLowerCase());
		}
		else System.out.println(input.toUpperCase());
	}
}