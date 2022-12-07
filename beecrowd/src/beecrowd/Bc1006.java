package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1006 {

	public static void main(String[] args) {
		double x, y, z, w;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		sc.close();
		w = ((x * 2) + (y * 3) + (z * 5))/10;
		Locale.setDefault(Locale.US);
		System.out.printf("MEDIA = %.1f%n", w);
	}

}
