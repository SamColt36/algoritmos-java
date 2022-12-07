package beecrowd;

import java.util.Scanner;

public class Bc1021 {

	public static void main(String[] args) {
		double vd, v, x;
		int C100, C50, C20, C10, C5, C2, C1, rM50, M50, rM25, M25, rM10, M10, rM5, M5, M1, z; 
		int resto100, resto50, resto20, resto10, resto5, resto2, resto1;
		System.out.print("Digite o valor: R$ ");
		Scanner sc =  new Scanner(System.in);
		vd = sc.nextDouble();
		sc.close();
		int vi = (int) vd;
		v = vd;
		if (vi > 0) {
			if (vi >= 100) {
				C100 = (vi / 100);
				resto100 = (vi % 100);
				System.out.println("NOTAS:");
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
				// MOEDAS ================
				System.out.println("MOEDAS:");
				C1 = (resto2 / 1);
				resto1 = (resto2 % 1);
				System.out.println(C1 + " moeda(s) de R$ 1,00");
				
				x = (v % 1)*100;
				z = (int) Math.round(x);
				M50 = z/50;
				rM50 = z%50;
				System.out.println(M50 + " moeda(s) de R$ 0,50");
				//M25
				M25 = rM50/25;
				rM25 = rM50%25;
				System.out.println(M25 + " moeda(s) de R$ 0,25");
				//M10
				M10 = rM25/10;
				rM10 = rM25%10;
				System.out.println(M10 + " moeda(s) de R$ 0,10");
				//M5
				M5 = rM10/5;
				rM5 = rM10%5;
				System.out.println(M5 + " moeda(s) de R$ 0,05");
				//M1
				M1 = (rM5);
				System.out.println(M1 + " moeda(s) de R$ 0,01");
				
			} else {
				C100 = (vi / 100);
				resto100 = (vi % 100);
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
				// MOEDAS ================
				System.out.println("MOEDAS:");
				C1 = (resto2 / 1);
				resto1 = (resto2 % 1);
				System.out.println(C1 + " moeda(s) de R$ 1,00");
				
				x = (v % 1)*100;
				z = (int) Math.round(x);
				M50 = z/50;
				rM50 = z%50;
				System.out.println(M50 + " moeda(s) de R$ 0,50");
				//M25
				M25 = rM50/25;
				rM25 = rM50%25;
				System.out.println(M25 + " moeda(s) de R$ 0,25");
				//M10
				M10 = rM25/10;
				rM10 = rM25%10;
				System.out.println(M10 + " moeda(s) de R$ 0,10");
				//M5
				M5 = rM10/5;
				rM5 = rM10%5;
				System.out.println(M5 + " moeda(s) de R$ 0,05");
				//M1
				M1 = (rM5);
				System.out.println(M1 + " moeda(s) de R$ 0,01");
			}
		} else {
			System.out.println("Escreva um número entre 0 e 1000000.");
		}
	}
}
