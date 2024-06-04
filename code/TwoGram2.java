import java.util.*;
public class TwoGram2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<n-1; i++)
		{
			String candidate = s.substring(i,i+2);
			map.put(candidate, map.getOrDefault(candidate,0)+1);
		}
		String ans = "";
		int maxFreq = 0;
		for(String str : map.keySet())
		{
			if (map.get(str) > maxFreq) {
                maxFreq = map.get(str);  // Update maxFreq when a new maximum is found
                ans = str;  // Update ans to the new two-gram with the highest frequency
            }
		}
		System.out.println(ans);
	}
}