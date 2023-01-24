package beecrowd;

import java.util.Scanner;

public class Bc1075 {

	public static void main(String[] args) {
		System.out.println("Write an integer (0 < N < 10,000): ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10000; i++) {

			if (i % n == 2) {
				System.out.println(i);
			}

		}
		sc.close();
	}

}
