import java.util.*;

public class QueueAtTheSchool{
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	    int len = sc.nextInt();
	    int time = sc.nextInt();

	    sc.nextLine();
	    String queue = sc.nextLine();
	    char []charArray = queue.toCharArray();

	    for(int i=0; i<time; i++)
	    {
		    for(int j=0; j<charArray.length-1; j++)
		    {
		    	if(charArray[j] == 'B' && charArray[j+1] == 'G')
		    	{
		    		charArray[j] = 'G';
		    		charArray[j+1] = 'B';
		    		j++;
		    	}
		    }
	    }
	    String str = new String(charArray);
	    System.out.println(str);
	}
}