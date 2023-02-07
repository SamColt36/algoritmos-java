package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double salario, numeroVendas, total;
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		salario = sc.nextDouble();
		numeroVendas = sc.nextDouble();
		total = salario + (.15*numeroVendas);
		sc.close();
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
	}

}
