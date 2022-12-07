package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Bc1005 {

	public static void main(String[] args) {
		double x, y, z;
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		y = sc.nextDouble();
		sc.close();
		z = ((x*3.5) + (y*7.5))/11;
		Locale.setDefault(Locale.US);
		System.out.printf("MEDIA = %.5f%n", z);
	}

}
