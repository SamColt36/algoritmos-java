package beecrowd;

import java.util.Random;

public class Bc1080 {

	public static void main(String[] args) {
		int z = 0;
		int cont = 0;

		
		Random gerador = new Random();
		int[] vect = new int[100];

		for (int i = 0; i < 100; i++) {
			vect[i] = Math.abs(gerador.nextInt());
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(vect[i]);
			if (vect[i] > z) {
				z = vect[i];
				cont = (i+1);
			}
		}
		System.out.println();
		System.out.println("number is " + z + " position " + cont);
	}

}
/*
 * Usando o contrutor Random() sem argumentos, sempre que executar o programa uma nova sequência de números é gerada.
 * Se por acaso quiser utilizar uma sequência fixada, isto é, sempre a mesma, deve-se utilizar algum argumento no construtor, por exemplo o número 0 ou 12344.
 */
