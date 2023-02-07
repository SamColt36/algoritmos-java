package beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bc1021 {

	public static void main(String[] args) {

		System.out.print("Digite o valor: R$ ");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		sc.close();

		if (n > 0) {
			Calc(n);
		} else {
			System.out.println("Escreva um número entre 0 e 1000000.");
		}
	}

	public static void Calc(double n) {
		List<Integer> list = new ArrayList<>();
		List<Integer> notas = new ArrayList<>();
		List<Integer> moedas = new ArrayList<>();
		List<Integer> moedasResto = new ArrayList<>();

		list.add(0, (int) (n % 100));
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

		notas.add(0, (int) (n / 100));
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
		// M1 = (resto2 / 1);

		double x = (n % 1)*100;
		int z = (int) Math.round(x);
		
		moedas.add(0, (z / 50));
		moedasResto.add(0, (z % 50));
		// M50 = z / 50;
		// rM50 = z % 50;
		moedas.add(1, moedasResto.get(0) / 25);
		moedasResto.add(1, (z % 25));
		// M25 = rM50 / 25;
		// rM25 = rM50 % 25;
		moedas.add(2, moedasResto.get(1) / 10);
		moedasResto.add(2, (z % 10));
		// M10 = rM25 / 10;
		// rM10 = rM25 % 10;
		moedas.add(3, moedasResto.get(2) / 5);
		moedasResto.add(3, (z % 5));
		// M5 = rM10 / 5;
		// rM5 = rM10 % 5;
		moedas.add(4, moedasResto.get(3));
		// moedasResto.add(4, moedas.get(3));
		// M1 = (rM5);
		if (n >= 100) {
			System.out.println(notas.get(0) + " nota(s) de R$ 100,00");
		} else {
			System.out.println("0 nota(s) de R$ 100,00");
		}
		System.out.println(notas.get(1) + " nota(s) de R$ 50,00");
		System.out.println(notas.get(2) + " nota(s) de R$ 20,00");
		System.out.println(notas.get(3) + " nota(s) de R$ 10,00");
		System.out.println(notas.get(4) + " nota(s) de R$ 5,00");
		System.out.println(notas.get(5) + " nota(s) de R$ 2,00");
		System.out.println("MOEDAS:");
		System.out.println(notas.get(6) + " moeda(s) de R$ 1,00");
		System.out.println(moedas.get(0) + " moeda(s) de R$ 0,50");
		System.out.println(moedas.get(1) + " moeda(s) de R$ 0,25");
		System.out.println(moedas.get(2) + " moeda(s) de R$ 0,10");
		System.out.println(moedas.get(3) + " moeda(s) de R$ 0,05");
		System.out.println(moedas.get(4) + " moeda(s) de R$ 0,01");
	}
}
