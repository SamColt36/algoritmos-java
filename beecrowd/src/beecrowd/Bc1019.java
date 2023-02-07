package beecrowd;

import java.util.Scanner;

public class Bc1019 {

	public static void main(String[] args) {
		int hora, minuto, tempo, segundo;
		System.out.print("Escreva o tempo em segundos: ");
		Scanner sc = new Scanner(System.in);
		tempo = sc.nextInt();
		sc.close();

		hora = (tempo / 3600); // horas
		minuto = ((tempo % 3600) / 60); // minutos
		segundo = ((tempo % 3600) % 60);// segundos
		System.out.println(hora + ":" + minuto + ":" + segundo);

	}

}
