import java.util.*;
public class AntonAndLetters{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		HashSet<String> set = new HashSet<>();
		
		int ans = countDistinctWords(input, set, input.length());
		System.out.println(ans);
	}
    static int countDistinctWords(String input, HashSet<String> set, int len)
    {
    	if(len == 2)return 0;

    	StringBuilder sb = new StringBuilder();
    	for(int i=1; i<input.length()-1; i++)
    	{
    		if((input.charAt(i) >='a' && input.charAt(i)<='z') || (input.charAt(i) >='A' && input.charAt(i)<='Z'))
    		{

    			while(i<input.length()-1 && input.charAt(i) != ' ' && input.charAt(i) !=',')
    			{
    				sb.append(input.charAt(i));
    				i++;
    			}
    			set.add(sb.toString());
    			sb.setLength(0);
    		}
    	}
    	return set.size();
    }
}