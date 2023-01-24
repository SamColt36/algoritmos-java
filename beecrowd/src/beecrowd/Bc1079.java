package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.print("Write an integer: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Bc1079Entities[] v = new Bc1079Entities[n];

		for (int j = 0; j < n; j++) {
			Double nota1 = sc.nextDouble();
			Double nota2 = sc.nextDouble();
			Double nota3 = sc.nextDouble();
			v[j] = new Bc1079Entities(nota1, nota2, nota3);
		}
		for (int j = 0; j < n; j++) {
			System.out.println(String.format("%.1f", v[j].media()));
		}

		sc.close();

	}
}
