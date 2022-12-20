package beecrowd;

import java.util.Scanner;

public class Bc1061 {

	public static void main(String[] args) {
		int di, df, hi, mi, si, hf, mf, sf, vd, vm, vs;
		int dias = 0, horas = 0, minutos = 0, segundos = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("-----CALCULADORA DE DATA-----");
		System.out.print("--DIA INICIAL: ");
		di = sc.nextInt();
		System.out.print("HORA INICIAL:  ");
		hi = sc.nextInt();
		System.out.print("MINUTO INICIAL:  ");
		mi = sc.nextInt();
		System.out.print("SEGUNDO INICIAL:  ");
		si = sc.nextInt();

		System.out.println();
		System.out.print("--DIA FINAL: ");
		df = sc.nextInt();
		System.out.print("HORA FINAL:  ");
		hf = sc.nextInt();
		System.out.print("MINUTO FINAL:  ");
		mf = sc.nextInt();
		System.out.print("SEGUNDO FINAL:  ");
		sf = sc.nextInt();

		sc.close();

		// converter para segundos
		int totalSegundosInicial = di * 86400 + hi * 3600 + mi * 60 + si;
		int totalSegundosFinal = df * 86400 + hf * 3600 + mf * 60 + sf;
		int deltaSegundos = totalSegundosFinal - totalSegundosInicial;

		segundos = deltaSegundos % 60;

		if ((deltaSegundos / 60) > 60) {
			minutos = ((deltaSegundos / 60) % 60);
		}

		if ((deltaSegundos / 3600) > 24) {
			horas = (deltaSegundos / 3600) % 24;
			dias = (deltaSegundos / 3600) / 24;
		}

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");

	}

}
