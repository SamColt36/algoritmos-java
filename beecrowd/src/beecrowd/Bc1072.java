package beecrowd;

import java.util.Scanner;

public class Bc1072 {

	public static void main(String[] args) {
		int n, a, b, c, d, in = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE O NUMERO DE ITERACOES: ");
		n = sc.nextInt();

		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			
			if (v[i] >= 10 && v[i] <=20) {
				in += 1;
			}
		}
		int out = (v.length - in);
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
