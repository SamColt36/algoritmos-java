package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1012 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		
		Locale.setDefault(Locale.US);
		System.out.printf("TRIANGULO: %.3f%n", (a * c / 2));
		System.out.printf("CIRCULO: %.3f%n", (Math.PI * Math.pow(c, 2)));
		System.out.printf("TRAPEZIO: %.3f%n", ((a + b) * c) / 2);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f%n", (a * b));
	}

}
