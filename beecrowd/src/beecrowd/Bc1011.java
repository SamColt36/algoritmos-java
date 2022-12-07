package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1011 {

	public static void main(String[] args) {
		double r, v;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		sc.close();
		v = (4.0/3) * Math.PI * Math.pow(r, 3);
		Locale.setDefault(Locale.US);
		System.out.printf("VOLUME = %.3f", v);
	}

}
