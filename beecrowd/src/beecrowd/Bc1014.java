package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1014 {

	public static void main(String[] args) {
		double a, b, m;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		m = a / b;
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f km/L", m);
	}

}
