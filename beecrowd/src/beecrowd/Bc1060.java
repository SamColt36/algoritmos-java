package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double[] vect = new double[6];
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		for (int i = 0; i < 6; i++) {
			vect[i] = sc.nextDouble();
			if (vect[i] > 0) {
				cont += 1;
			}
		}
		sc.close();
		System.out.println(cont + " valores positivos");
	}

}
