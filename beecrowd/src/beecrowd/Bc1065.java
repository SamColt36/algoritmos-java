package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1065 {

	public static void main(String[] args) {
		double auxiliar = 0;
		Locale.setDefault(Locale.US);
		double[] vect = new double[6];
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		for (int i = 0; i < 5; i++) {
			vect[i] = sc.nextDouble();
			if ((vect[i] % 2) == 0) {
				cont += 1;
			}
		}
		sc.close();
		System.out.println(cont + " valores pares");
	}

}
