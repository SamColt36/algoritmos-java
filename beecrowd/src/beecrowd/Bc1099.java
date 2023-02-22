package beecrowd;

import java.util.Scanner;

public class Bc1099 {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);

		System.out.print("QUANTITY: ");
		int n = sc.nextInt();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {

			x = sc.nextInt();
			y = sc.nextInt();

			if (y > x)
				result[i] = (Intervalo(x, y));
			else
				result[i] = (Intervalo(y, x));
		}
		sc.close();
		System.out.println("RESULT");
		for (int obj : result) {
			System.out.println(obj);
		}
	}

	public static Integer Intervalo(int a, int b) {
		int i, aux = 0;
		for (i = (a + 1); i < b; i++) {

			if (i % 2 == 1 || i % 2 == -1) {
				aux += i;
			}
		}
		return aux;
	}
}
