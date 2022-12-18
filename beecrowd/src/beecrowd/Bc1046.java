package beecrowd;

import java.util.Scanner;

public class Bc1046 {

	public static void main(String[] args) {
		int hInicial, hFinal, intervalo;
		Scanner sc = new Scanner(System.in);
		System.out.print("HORA INICIAL: ");
		hInicial =sc.nextInt();
		
		System.out.print("HORA FINAL: ");
		hFinal =sc.nextInt();
		
		if (hInicial >= hFinal ) {
			intervalo = 24 - hInicial + hFinal;
		} else {
			intervalo = hFinal - hInicial;
		}
		
		System.out.println("O JOGO DUROU " + intervalo + " HORA(S)");
		
		sc.close();
	}

}
