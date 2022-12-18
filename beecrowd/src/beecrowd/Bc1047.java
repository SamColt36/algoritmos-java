package beecrowd;

import java.util.Scanner;

public class Bc1047 {

	public static void main(String[] args) {
		int hi, mi, hf, mf, dHoras, dMinutos;
		Scanner sc = new Scanner(System.in);

		System.out.print("HORA INICIAL: ");
		hi = sc.nextInt();

		System.out.print("MINUTO INICIAL: ");
		mi = sc.nextInt();

		System.out.print("HORA FINAL: ");
		hf = sc.nextInt();

		System.out.print("MINUTO FINAL: ");
		mf = sc.nextInt();
		sc.close();

		if (hf > hi) {
			dHoras = hf - hi;
		} else if (hf < hi) {
			dHoras = 24 - hi + hf;
		} else {
			dHoras = 24;
		}

		if (mf > mi) {
			dMinutos = mf - mi;
		} else if (mf < mi) {
			dMinutos = 60 - (mi - mf);
			dHoras -= 1;
		} else {
			dMinutos = 0;
		}

		System.out.println();
		System.out.println("O JOGO DUROU " + dHoras + " HORA(S) E " + dMinutos + " MINUTOS(S)");

	}
}
