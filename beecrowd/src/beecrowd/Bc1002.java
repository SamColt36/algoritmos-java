package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1002 {

	public static void main(String[] args) {
		double raio, area;
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		area = Math.PI * Math.pow(raio, 2);
		Locale.setDefault(Locale.US);
		System.out.printf("A=%.4f%n", area);
	}

}
