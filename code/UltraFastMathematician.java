import java.util.*;
public class UltraFastMathematician{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int ans = num1 ^ num2;
		String binary = Integer.toBinaryString(ans);
		System.out.println(binary);
	}
}