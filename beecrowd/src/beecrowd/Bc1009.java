package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1009 {

	public static void main(String[] args) {
		String name;
		double salary, nvendas, total;
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		salary = sc.nextDouble();
		nvendas = sc.nextDouble();
		total = salary + (.15*nvendas);
		sc.close();
		Locale.setDefault(Locale.US);
		System.out.printf("TOTAL = R$ %.2f%n", total);
	}

}
