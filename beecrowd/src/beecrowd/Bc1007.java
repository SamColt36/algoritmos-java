package beecrowd;

import java.util.Scanner;

public class Bc1007 {

	public static void main(String[] args) {
		int a, b, c, d, z;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		z = ((a*b) - (c*d));
		System.out.println("DIFERENCA = " + z);
	}

}
