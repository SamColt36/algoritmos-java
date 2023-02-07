package beecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Bc1008 {

	public static void main(String[] args) {
		int hora, numero;
		double rendaPorHora, salario;
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		hora = sc.nextInt();
		rendaPorHora = sc.nextDouble();
		sc.close();
		
		salario = hora * rendaPorHora;
		Locale.setDefault(Locale.US);
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}

}
