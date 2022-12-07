package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Bc1008 {

	public static void main(String[] args) {
		String n;
		int h;
		double rph, s;
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		h = sc.nextInt();
		rph = sc.nextDouble();
		sc.close();
		s = h * rph;
		Locale.setDefault(Locale.US);
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n", s);
	}

}
