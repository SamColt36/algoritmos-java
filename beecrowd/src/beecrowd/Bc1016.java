package beecrowd;

import java.util.Scanner;

public class Bc1016 {

	public static void main(String[] args) {
		int t, s;
		System.out.print("Escreva a diferenca das distancias: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		t = (s * 2); // (s / 30) * 60 = (s * 2)
		System.out.println(t + " minutos");
	}

}
