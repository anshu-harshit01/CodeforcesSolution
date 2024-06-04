import java.util.*;

public class NextRound{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int position = sc.nextInt();

		int scores[] = new int[participants];
		for(int i=0; i<participants; i++)
		{
			scores[i] = sc.nextInt();
		}
		contestantsPasses(scores, position);
	}
	public static void contestantsPasses(int scores[], int position)
	{
		int numberOfQualifiedContestant = 0;
		int target = scores[position-1];
		for(int score : scores)
		{
			if(score > 0 && score >= target )
			{
				numberOfQualifiedContestant++;
			}
		}
		System.out.println(numberOfQualifiedContestant);
	}
}