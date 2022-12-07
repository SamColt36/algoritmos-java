package beecrowd;
import java.util.Scanner;

public class Bc1037 {

	public static void main(String[] args) {
		double n;
		// ([0,25], (25,50], (50,75], (75,100])
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();
		if (n >= 0) {
			if (n <= 25) {
				System.out.println("Intervalo [0,25]");
			}
		}
		else {
			System.out.println("Fora do intervalo");
		}
		if (n > 25) {
			if (n <= 50) {
				System.out.println("Intervalo (25,50]");
			}
		}
		if (n > 50) {
			if (n <= 75) {
				System.out.println("Intervalo (50,75]");
			}
		}
		if (n > 75) {
			if (n <= 100) {
				System.out.println("Intervalo (75,100]");
			}
			else {
				System.out.println("Fora do intervalo");
			}
		}
	}

}