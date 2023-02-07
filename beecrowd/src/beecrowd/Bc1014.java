package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1014 {

	public static void main(String[] args) {
		double km, l;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		km = sc.nextDouble();
		l = sc.nextDouble();
		
		System.out.printf("%.3f km/L", km / l);

		sc.close();
	}

}
