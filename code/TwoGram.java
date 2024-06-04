import java.util.*;
public class TwoGram{
	private static double PRIME = 101;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<n-1; i++)
		{
			String candidate = str.substring(i, i+2);
			int count = karpRabin(str, candidate);
			map.put(candidate, count);
		}
		String result="";
		int maxFreq = -1;
		for(String ans : map.keySet())
		{
			if(map.get(ans) >= maxFreq)
			{
				result = ans;
			}
			maxFreq = Math.max(maxFreq, map.get(ans));
		}
		System.out.println(result);
	}
	public static double calculateHash(String str)
	{
		double hash = 0;
		for(int i=0; i<str.length(); i++)
		{
			hash = hash + str.charAt(i)*Math.pow(PRIME, i);
		}
		return hash;
	}
	public static double updateHash(double prevHash, char oldChar, char newChar, int patternLength)
	{
		double newHash = (prevHash - oldChar)/PRIME;
		newHash += newChar*Math.pow(PRIME, patternLength-1);
		return newHash;
	}
	public static int karpRabin(String text, String pattern)
	{
		int patternLen = pattern.length();
		int textLen = text.length();
		int count = 0;

		double textHash = calculateHash(text.substring(0, patternLen));
		double patternHash = calculateHash(pattern);

		for(int i=0; i<textLen-patternLen; i++)
		{
			if(textHash == patternHash)
			{
				if(text.substring(i, i+patternLen).equals(pattern)){
					count++;
				}
			}
			if(i<textLen-patternLen)
			{
				textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLen), patternLen);
			}
		}
		return count;
	}
}