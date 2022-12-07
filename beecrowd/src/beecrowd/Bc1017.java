package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1017 {

	public static void main(String[] args) {
		int t, v, s;
		double d;
		System.out.print("Escreva o tempo (em h) medio da viagem: ");
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		System.out.print("Escreva a velocidade media (em km/h) da viagem: ");
		v = sc.nextInt();
		sc.close();
		s = (v * t);
		//O problema sugere que T e V sejam inteiros, S não necessariamente tem que ser inteiro,
		//porém a multiplicação de dois inteiros sempre é inteiro. 
		//D tem que ser ponto flutuante com três casas decimais de aproximação.
		d = (s / 12.0);
		Locale.setDefault(Locale.US);
		System.out.printf("L = %.3f", d);
	}

}
