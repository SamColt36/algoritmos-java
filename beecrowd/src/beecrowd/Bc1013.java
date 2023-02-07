package beecrowd;

import java.util.Scanner;

public class Bc1013 {

	public static void main(String[] args) {
		int a, b, c, z;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		if (a > b) {
			z = (a + c + Math.abs(a - c)) / 2;
			System.out.println(z + " eh o maior");
		} else {
			z = (b + c + Math.abs(b - c)) / 2;
			System.out.println(z + " eh o maior");
		}

	}

}
