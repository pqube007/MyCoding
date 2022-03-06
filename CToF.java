import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float f = (c * 1.8f) + 32f;
		System.out.println(f);
	}
}
