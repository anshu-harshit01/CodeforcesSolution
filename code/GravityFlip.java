import java.util.*;
public class GravityFlip{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int box[] = new int[n];
		for(int i=0; i<n; i++)
		{
			box[i] = sc.nextInt();
		}
		Arrays.sort(box);
		for(int i:box)
		{
			System.out.print(i+" ");
		}
	}
}