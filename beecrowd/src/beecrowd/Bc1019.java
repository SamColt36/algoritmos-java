package beecrowd;

import java.util.Scanner;

public class Bc1019 {

	public static void main(String[] args) {
		int h, m, s ,sg;
		System.out.print("Escreva o tempo em segundos: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		sc.close();
		h = (s / 3600); //horas
		m = ((s % 3600) / 60); //minutos
		sg = ((s % 3600) % 60);//segundos
		System.out.println(h + ":" + m + ":" + sg);

	}

}
