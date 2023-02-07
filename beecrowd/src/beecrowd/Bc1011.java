package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1011 {

	public static void main(String[] args) {
		double raio, volume;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		sc.close();
		volume = (4.0/3) * Math.PI * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f", volume);
	}

}
