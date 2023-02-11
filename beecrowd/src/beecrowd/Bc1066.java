package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1066 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double[] vect = new double[6];
		Scanner sc = new Scanner(System.in);

		int contPar = 0, contImpar = 0, contPositivo = 0, contNegativo = 0;
		for (int i = 0; i < 5; i++) {
			vect[i] = sc.nextDouble();

			if ((vect[i] % 2) == 0) {
				contPar += 1;
			} else {
				contImpar += 1;
			}

			if (vect[i] > 0) {
				contPositivo += 1;
			} else if (vect[i] == 0) {
			} else {
				contNegativo += 1;
			}
		}
		sc.close();
		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPositivo + " valor(es) positivo(s)");
		System.out.println(contNegativo + " valor(es) negativo(s)");

	}

}
