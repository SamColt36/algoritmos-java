package beecrowd;

import java.util.Scanner;

public class Bc1004 {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		z = x * y;
		System.out.println("PROD = " + z);
	}

}
