package beecrowd;

import java.util.Scanner;

public class Bc1070 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva um número inteiro: ");
		n = sc.nextInt();

		int cont = 0;
		for (int i = 1; i < 7; i++) {

			if (n % 2 == 1) {
				cont = cont + 2;
				System.out.println(n + cont);
			}

			else if (n % 2 == 0) {
				n = n + 1;
				System.out.println(n);
			}
		}
		sc.close();
	}

}
