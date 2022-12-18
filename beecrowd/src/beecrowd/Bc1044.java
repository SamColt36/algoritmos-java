package beecrowd;

import java.util.Scanner;

public class Bc1044 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("NUMBER 1: ");
		a = sc.nextInt();
		
		System.out.print("NUMBER 2: ");
		b = sc.nextInt();
		
		System.out.println();
		if (a%b==0 || b%a==0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}
