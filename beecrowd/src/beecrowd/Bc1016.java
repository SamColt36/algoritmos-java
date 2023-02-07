package beecrowd;

import java.util.Scanner;

public class Bc1016 {

	public static void main(String[] args) {
		int tempo, distancia;
		System.out.print("Escreva a diferenca das distancias: ");
		Scanner sc = new Scanner(System.in);
		distancia = sc.nextInt();
		tempo = (distancia * 2); // (s / 30) * 60 = (s * 2)
		System.out.println(tempo + " minutos");

		sc.close();
	}

}
