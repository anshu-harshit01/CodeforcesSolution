import java.util.*;

public class BoyOrGirl{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap<Character,Integer> map = new HashMap<>();

		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		int size = map.size();
		if(size % 2== 0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else{
			System.out.println("IGNORE HIM!");
		}
	}
}