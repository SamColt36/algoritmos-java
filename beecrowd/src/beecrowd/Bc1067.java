package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bc1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= n; i=i+2) {
			System.out.println(i);
		}
		

		sc.close();

	}

}
