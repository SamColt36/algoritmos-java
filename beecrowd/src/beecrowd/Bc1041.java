package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x, y;
		System.out.printf("Digite o valor de x: ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		System.out.printf("Digite o valor de y: ");
		y = sc.nextDouble();
		if (x == 0) {
			if (y == 0) {
				System.out.println("Origem");
			} else {
				System.out.println("Eixo Y");
			}
		} else {
			if (y == 0) {
				System.out.println("Eixo X");
			} else {
				if (x > 0) { // x+
					if (y > 0) {
						System.out.println("Q1");
					} else {
						System.out.println("Q4");
					}
				} else { // x-
					if (y > 0) { // y+
						System.out.println("Q2");
					} else { // y-
						System.out.println("Q3");
					}
				}
			}
		}

	}

}
