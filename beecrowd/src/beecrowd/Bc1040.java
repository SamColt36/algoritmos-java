package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1040 {

	public static void main(String[] args) {
		double n1, n2, n3, n4, media;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NOTA 1 = ");
		n1 = sc.nextDouble();
		
		System.out.print("NOTA 2 = ");
		n2 = sc.nextDouble();
		
		System.out.print("NOTA 3 = ");
		n3 = sc.nextDouble();
		
		System.out.print("NOTA 4 = ");
		n4 = sc.nextDouble();
		
		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
		System.out.println();
		
		if (media>=7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		} else if (media<5.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		} else {
			System.out.print("AF: ");
			double nExame = sc.nextDouble();
			
			System.out.println();
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f%n", nExame);
			double mediaFinal = (nExame+media)/2;
			if (mediaFinal>=5) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			}
		}
		sc.close();
	}

}
