package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1094 {

	public static void main(String[] args) {
		int total = 0, coelhos = 0, ratos = 0, sapos = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Casos de teste: ");
		int n = sc.nextInt();

		Bc1094Entities[] vect = new Bc1094Entities[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Experiencia " + (i + 1) + ": ");
			int quantity = sc.nextInt();
			char species = sc.next().charAt(0);

			vect[i] = new Bc1094Entities(quantity, species);

			if (vect[i].getType() == 'C' || vect[i].getType() == 'c') {
				coelhos += vect[i].getNumber();
			} else if (vect[i].getType() == 'R' || vect[i].getType() == 'r') {
				ratos += vect[i].getNumber();
			} else if (vect[i].getType() == 'S' || vect[i].getType() == 's') {
				sapos += vect[i].getNumber();
			}

		}

		total = coelhos + ratos + sapos;
		System.out.println();
		System.out.println("Total: " + total + " cobaia(s)");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", (coelhos * 100.0 / total)) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f", (ratos * 100.0 / total)) + " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f", (sapos * 100.0 / total)) + " %");
		sc.close();
	}
}
