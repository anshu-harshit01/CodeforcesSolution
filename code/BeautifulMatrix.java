import java.util.*;

public  class BeautifulMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[5][5];
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		int currRow = -1;
		int currCol = -1;

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(matrix[i][j] == 1)
				{
					currRow = i;
					currCol = j;
					break;
				}
			}
		}
		int operations = Math.abs(2-currRow) + Math.abs(2-currCol);
		System.out.println(operations);
	}
}