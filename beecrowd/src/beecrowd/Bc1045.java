package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1045 {

	public static void main(String[] args) {
		double a = 0.0, b = 0.0, c = 0.0, auxiliar = 0.0;
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double[] vect = new double[3];
		System.out.println("*INSIRA TRES NUMEROS MAIORES QUE ZERO*");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print("NUMBER " + (i + 1) + ": ");
			vect[i] = sc.nextDouble();
		}

		for (int i = 0; i < vect.length; i++) {

			for (int j = 0; j < vect.length; j++) {
				if (vect[i] < vect[j]) {
					auxiliar = vect[i];
					vect[i] = vect[j];
					vect[j] = auxiliar;
				}
			}
		}

		a = vect[2];
		b = vect[1];
		c = vect[0];

		sc.close();
		System.out.println();
		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (a == c) {
				System.out.println("TRIANGULO ISOSCELES");
			} else if (a == b)   {
				System.out.println("TRIANGULO ISOSCELES");
			} else if  (b == c) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
	}
}
