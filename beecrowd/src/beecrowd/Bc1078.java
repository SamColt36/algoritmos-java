package beecrowd;

import java.util.Scanner;

public class Bc1078 {

	public static void main(String[] args) {
		System.out.print("Write an integer (2 < N < 1000): ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + n + " = " + (i * n));
		}
	}

}
