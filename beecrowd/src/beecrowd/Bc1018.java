package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bc1018 {

	public static void main(String[] args) {
		int N;
		System.out.print("Escreva um valor(inteiro): R$ ");
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();

		if (N > 0) {
			Calc(N);
		} else {
			System.out.println();
			System.out.println("ERRO: (0 < N < 1000000)");
		}
	}

	public static void Calc(int N) {
		List<Integer> list = new ArrayList<>();
		List<Integer> notas = new ArrayList<>();

		list.add(0, (N % 100));
		// resto100 = (N % 100);
		list.add(1, list.get(0) % 50);
		// resto50 = (resto100 % 50);
		list.add(2, list.get(1) % 20);
		// resto20 = (resto50 % 20);
		list.add(3, list.get(2) % 10);
		// resto10 = (resto20 % 10);
		list.add(4, list.get(3) % 5);
		// resto5 = (resto10 % 5);
		list.add(5, list.get(4) % 2);
		// resto2 = (resto5 % 2);

		notas.add(0, (N / 100));
		// C100 = (N / 100);
		notas.add(1, list.get(0) / 50);
		// C50 = (resto100 / 50);
		notas.add(2, list.get(1) / 20);
		// C20 = (resto50 / 20);
		notas.add(3, list.get(2) / 10);
		// C10 = (resto20 / 10);
		notas.add(4, list.get(3) / 5);
		// C5 = (resto10 / 5);
		notas.add(5, list.get(4) / 2);
		// C2 = (resto5 / 2);
		notas.add(6, list.get(5));
		// C1 = (resto2 / 1);

		if (N >= 100) {
			System.out.println(notas.get(0) + " nota(s) de R$ 100,00");
		} else {
			System.out.println("0 nota(s) de R$ 100,00");
		}
		System.out.println(notas.get(1) + " nota(s) de R$ 50,00");
		System.out.println(notas.get(2) + " nota(s) de R$ 20,00");
		System.out.println(notas.get(3) + " nota(s) de R$ 10,00");
		System.out.println(notas.get(4) + " nota(s) de R$ 5,00");
		System.out.println(notas.get(5) + " nota(s) de R$ 2,00");
		System.out.println(notas.get(6) + " nota(s) de R$ 1,00");
	}
}