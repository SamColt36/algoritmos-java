package beecrowd;

import java.util.Scanner;

public class Bc1071 {

	public static void main(String[] args) {
		int x, y, i, auxiliar = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("NUMBER 1: ");
		x = sc.nextInt();
		
		System.out.print("NUMBER 2: ");
		y = sc.nextInt();

		int cont = 0;
		// USAR COMO PONTOS DE INTERRUPCAO O VALORES X E Y
		if (y > x) {
			for (i = (x+1); i < y; i++) {
				
				if (i % 2 == 1 || i % 2 == -1) {
					auxiliar = i + auxiliar;
				}
			}
			System.out.println("RESULTADO: " + auxiliar);
		} else {
			for (i = (y+1); i < x; i++) {

				if (i % 2 == 1 || i % 2 == -1) {
					auxiliar = i + auxiliar;
				}
			}
			System.out.println("RESULTADO: " + auxiliar);
		}

	}

}
