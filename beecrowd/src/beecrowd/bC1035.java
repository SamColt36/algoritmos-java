package beecrowd;

import java.util.Scanner;

public class bC1035 {

	public static void main(String[] args) {
		int a, b, c, d, x, y, z;
		Scanner sc =  new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		x = a%2;
		y = a+b;
		z= c+d;
		if (b>c && d>a) {
			if (z>y) {
				if (c>0 && d>0) {
					if (x==0) {
						System.out.println("Valores aceitos");
					}
				}
			}
		} else {
			System.out.println("Valores nao aceitos");
		}

	}

}
