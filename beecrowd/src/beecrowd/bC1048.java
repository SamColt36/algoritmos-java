package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class bC1048 {

	public static void main(String[] args) {
		double salario, nSalario, percentage;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE SEU SALARIO: ");
		salario = sc.nextDouble();

		System.out.println();
		if (salario > 0) {
			if (salario <= 400) {
				percentage = 15;
				nSalario = (salario * percentage / 100) + salario;
				System.out.printf("Novo salario: %.2f%n", nSalario);
				System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
				System.out.println("Em percentual: " + (int) percentage + "%");
			}
			if (salario > 400) {
				if (salario <= 800) {
					percentage = 12;
					nSalario = (salario * percentage / 100) + salario;
					System.out.printf("Novo salario: %.2f%n", nSalario);
					System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
					System.out.println("Em percentual: " + (int) percentage + "%");
				}
			}
			if (salario > 800) {
				if (salario <= 1200) {
					percentage = 10;
					nSalario = (salario * percentage / 100) + salario;
					System.out.printf("Novo salario: %.2f%n", nSalario);
					System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
					System.out.println("Em percentual: " + (int) percentage + "%");
				}
			}
			if (salario > 1200) {
				if (salario <= 2000) {
					percentage = 7;
					nSalario = (salario * percentage / 100) + salario;
					System.out.printf("Novo salario: %.2f%n", nSalario);
					System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
					System.out.println("Em percentual: " + (int) percentage + "%");
				}
			}
			if (salario > 2000) {
				percentage = 10;
				nSalario = (salario * percentage / 100) + salario;
				System.out.printf("Novo salario: %.2f%n", nSalario);
				System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
				System.out.println("Em percentual: " + (int) percentage + "%");

			}
		}
	}
}


