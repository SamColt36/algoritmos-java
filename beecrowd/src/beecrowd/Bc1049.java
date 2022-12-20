package beecrowd;

import java.util.Scanner;

public class Bc1049 {

	public static void main(String[] args) {
		String a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		b = sc.next();
		c = sc.next();

		System.out.println();
		if (a.equals("vertebrado")) {
			if (b.equals("ave")) {
				if (c.equals("carnivoro")) {
					System.out.println("aguia");
				}
				if (c.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			if (b.equals("mamifero")) {
				if (c.equals("herbivoro")) {
					System.out.println("vaca");
				}
				if (c.equals("onivoro")) {
					System.out.println("homem");
				}
			}
		}
		if (a.equals("invertebrado")) {
			if (b.equals("inseto")) {
				if (c.equals("hematofago")) {
					System.out.println("pulga");
				}
				if (c.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			if (b.equals("anelideo")) {
				if (c.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				if (c.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		sc.close();
	}
}
