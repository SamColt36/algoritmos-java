package beecrowd;

import java.util.Scanner;

public class Bc1073 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER WITH NUMBER: ");
		int n = sc.nextInt();

		sc.close();

		if (n % 2 == 0 && n > 0)
			for (int i = 2; i <= n; i = i + 2)
				System.out.println(i + " ^ 2 = " + (int) Math.pow(i, 2));
		else if (n % 2 == 1 && n > 0)
			for (int i = 1; i <= n; i = i + 2)
				System.out.println(i + " ^ 2 = " + (int) Math.pow(i, 2));

		///// FALTA AJEITAR CONDICAO PARA N SER UM VALOR NEGATIVO ****

		if (n % 2 == 0 && n < 0) {
			n = n * -1;
			for (int i = 2; i <= n; i = i + 2)
				System.out.println(-i + " ^ 2 = -" + (int) Math.pow(i, 2));

		} else if (n % 2 == 1 && n < 0)
			for (int i = 1; i <= n; i = i + 2)
				System.out.println(-i + " ^ 2 = -" + (int) Math.pow(i, 2));
	}
}
