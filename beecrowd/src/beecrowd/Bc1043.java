package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1043 {

	public static void main(String[] args) {
		double a, b, c, perimeter, area;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Lado A: ");
		a = sc.nextDouble();
		System.out.print("Lado B: ");
		b = sc.nextDouble();
		System.out.print("Lado C: ");
		c = sc.nextDouble();

		System.out.println();
		if (Math.abs(b - c) < a && a < b + c) {
			if (Math.abs(a - c) < b && b < a + c) {
				if (Math.abs(a - b) < c && c < a + b) {
					perimeter = a + b + c;
					System.out.printf("Perimeter  = %.1f%n", perimeter);
				}
			}
		} else {
			area = ((a + b) * c) / 2;
			System.out.printf("Area  = %.1f%n", area);
		}
		sc.close();
	}

}
