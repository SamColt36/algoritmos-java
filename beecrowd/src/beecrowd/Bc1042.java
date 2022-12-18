package beecrowd;

import java.util.Scanner;

public class Bc1042 {

	public static void main(String[] args) {
		int n1, n2, n3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres numeros inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		System.out.println();
		if (n1 < n2 && n1 < n3) {
			System.out.println(n1);
			if (n2 < n3) {
				System.out.println(n2);
				System.out.println(n3);
			} else {
				System.out.println(n3);
				System.out.println(n2);
			}
		}

		if (n2 < n1 && n2 < n3) {
			System.out.println(n2);
			if (n3 < n1) {
				System.out.println(n3);
				System.out.println(n1);
			} else {
				System.out.println(n1);
				System.out.println(n3);
			}
		}

		if (n3 < n1 && n3 < n2) {
			System.out.println(n3);
			if (n1 < n2) {
				System.out.println(n1);
				System.out.println(n2);
			} else {
				System.out.println(n2);
				System.out.println(n1);
			}
		}
		
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		sc.close();
	}

}
