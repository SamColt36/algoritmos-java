package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1010 {

	public static void main(String[] args) {
		int code1, code2, n1, n2;
		double v1, v2, pagar;
		Scanner sc = new Scanner(System.in);
		code1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		code2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		sc.close();
		pagar = (n1 * v1) + (n2 * v2);
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f", pagar);
	}
}
