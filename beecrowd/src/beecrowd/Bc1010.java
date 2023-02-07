package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int quantidade;
		double valor, pagar = 0;
		
		Scanner sc = new Scanner(System.in);
		//Entrada para o campo de 'código'
		sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		
		pagar += (quantidade * valor);

		//Entrada para o campo de 'código'
		sc.nextInt();
		quantidade = sc.nextInt();
		valor = sc.nextDouble();
		sc.close();
		
		pagar += (quantidade * valor);
		System.out.printf("VALOR A PAGAR: R$ %.2f", pagar);
	}
}