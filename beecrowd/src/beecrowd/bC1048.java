package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class bC1048 {

	public static void main(String[] args) {
		double salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE SEU SALARIO: ");
		salario = sc.nextDouble();

		System.out.println();
		if (salario > 0) {
			if (salario <= 400) {
				imprimir(salario, 15);
			}
			if (salario > 400) {
				if (salario <= 800) {
					imprimir(salario, 13);
				}
			}
			if (salario > 800) {
				if (salario <= 1200) {
					imprimir(salario, 10);
				}
			}
			if (salario > 1200) {
				if (salario <= 2000) {
					imprimir(salario, 7);
				}
			}
			if (salario > 2000) {
				imprimir(salario, 4);
			}
		}
	}

	public static void imprimir(double salario, int percentage) {
		double nSalario;
		nSalario = (salario * percentage / 100) + salario;
		System.out.printf("Novo salario: %.2f%n", nSalario);
		System.out.printf("Reajuste de ganho: %.2f%n", salario * percentage / 100);
		System.out.println("Em percentual: " + (int) percentage + "%");
	} 
}
