import java.util.Scanner;

public class DualTrigger1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for(int i=0; i<testcases; i++)
		{
			int len = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			boolean given = solve(str, len);
			System.out.println(given?"YES" : "NO");
		}
	}
	public static boolean solve(String str, int len)
	{

			if(len == 2 && str.equals("00")){
				return true;
			}
			if(len == 2){
				return false;
			}
			if(len == 1 && str.equals("0")){
				return true;
			}
			if(len == 1){
				return false;
			}
				int cnt = 0;
			    for(int s = 0; s<str.length(); s++){
				    if(str.charAt(s) == '1')cnt++;
			    }
			    if(cnt == 2)
			    {
			    	for(int j=0; j<str.length()-1; j++)
			    	{
			    		if(str.charAt(j) =='1' && str.charAt(j+1) == '1'){
			    			return false;
			    		}
			    	}
			    }
			    if(cnt % 2 == 0 ){
				    return true;
			    }
			    else{
				    return false;
			    }
	}
}