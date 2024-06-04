import java.util.*;
public class ContestProposal{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		while(testcases > 0)
		{
			int arrSize = sc.nextInt();
		    int a[] = new int[arrSize];
		    int b[] = new int[arrSize];

		    for(int i=0; i<arrSize; i++){
			    a[i] = sc.nextInt();
		    }
		    for(int i=0; i<arrSize; i++){
			    b[i] = sc.nextInt();
		    }

		    int i=0, j=0;
		    while(j < arrSize)
		    {
		    	if(a[i] > b[j]){
		    		j++;
		    	}
		    	else if(b[j] >= a[i]){
		    		i++;
		    		j++;
		    	}
		    }
		    System.out.println(arrSize-i);
		    testcases--;
		}

	}
}