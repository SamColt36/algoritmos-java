package beecrowd;

import java.util.Scanner;

public class Bc1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = sc.nextInt();

		int[] v = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "o number: ");
			v[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (v[i] % 2 == 0)
				if (v[i] > 0)
					System.out.println("EVEN POSITIVE");
				else if (v[i] == 0)
					System.out.println("NULL");
				else
					System.out.println("EVEN NEGATIVE");

			else if (v[i] > 0)
				System.out.println("ODD POSITIVE");
			else if (v[i] == 0)
				System.out.println("NULL");
			else
				System.out.println("ODD NEGATIVE");

			sc.close();
		}
	}
}
