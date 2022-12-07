package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1015 {

	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		sc.close();
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f", d);
	}

}
