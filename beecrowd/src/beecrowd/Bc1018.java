package beecrowd;

import java.util.Scanner;

public class Bc1018 {

	public static void main(String[] args) {
		int N, C100, C50, C20, C10, C5, C2, C1, resto100, resto50, resto20, resto10, resto5, resto2, resto1;
		System.out.print("Escreva um valor(inteiro): R$ ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		if (N > 0) {
			if (N >= 100) {
				C100 = (N / 100);
				resto100 = (N % 100);
				System.out.println(C100 + " nota(s) de R$ 100,00");

				C50 = (resto100 / 50);
				resto50 = (resto100 % 50);
				System.out.println(C50 + " nota(s) de R$ 50,00");

				C20 = (resto50 / 20);
				resto20 = (resto50 % 20);
				System.out.println(C20 + " nota(s) de R$ 20,00");

				C10 = (resto20 / 10);
				resto10 = (resto20 % 10);
				System.out.println(C10 + " nota(s) de R$ 10,00");

				C5 = (resto10 / 5);
				resto5 = (resto10 % 5);
				System.out.println(C5 + " nota(s) de R$ 5,00");

				C2 = (resto5 / 2);
				resto2 = (resto5 % 2);
				System.out.println(C2 + " nota(s) de R$ 2,00");

				C1 = (resto2 / 1);
				resto1 = (resto2 % 1);
				System.out.println(C1 + " nota(s) de R$ 1,00");
			} else {
				C100 = (N / 100);
				resto100 = (N % 100);
				System.out.println("0 nota(s) de R$ 100,00");

				C50 = (resto100 / 50);
				resto50 = (resto100 % 50);
				System.out.println(C50 + " nota(s) de R$ 50,00");

				C20 = (resto50 / 20);
				resto20 = (resto50 % 20);
				System.out.println(C20 + " nota(s) de R$ 20,00");

				C10 = (resto20 / 10);
				resto10 = (resto20 % 10);
				System.out.println(C10 + " nota(s) de R$ 10,00");

				C5 = (resto10 / 5);
				resto5 = (resto10 % 5);
				System.out.println(C5 + " nota(s) de R$ 5,00");

				C2 = (resto5 / 2);
				resto2 = (resto5 % 2);
				System.out.println(C2 + " nota(s) de R$ 2,00");

				C1 = (resto2 / 1);
				resto1 = (resto2 % 1);
				System.out.println(C1 + " nota(s) de R$ 1,00");
			}
		} else {
			System.out.println("Escreva um número entre 0 e 1000000.");
		}
	}
}
