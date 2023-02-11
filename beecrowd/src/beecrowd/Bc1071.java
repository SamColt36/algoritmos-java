package beecrowd;

import java.util.Scanner;

public class Bc1071 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.print("NUMBER 1: ");
		x = sc.nextInt();

		System.out.print("NUMBER 2: ");
		y = sc.nextInt();

		if (y > x)
			System.out.println(Intervalo(x, y));
		else
			System.out.println(Intervalo(y, x));

		sc.close();
	}

	public static String Intervalo(int a, int b) {
		int i, auxiliar = 0;
		for (i = (a + 1); i < b; i++) {

			if (i % 2 == 1 || i % 2 == -1) {
				auxiliar += i;
			}
		}
		return "RESULTADO: " + auxiliar;
	}
}
