package beecrowd;

import java.util.Scanner;

public class Bc1020 {

	public static void main(String[] args) {
		int idd, a, m, d;
		System.out.print("Escreva sua idade em dias: ");
		Scanner sc = new Scanner(System.in);
		idd = sc.nextInt();
		a = (idd / 365); // idade em anos
		m = ((idd % 365) / 30); // idade em meses
		d = ((idd % 365) % 30); // idade em dias
		System.out.println(a + " ano(s)");
		System.out.println(m + " mes(es)");
		System.out.println(d + " dia(s)");
	}

}
