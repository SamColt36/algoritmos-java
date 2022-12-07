package beecrowd;

import java.util.Scanner;

public class Bc1036 {

	public static void main(String[] args) {
		double a, b, c, x1, x2, delta, rdelta;
		System.out.print("Digite o valor da variavel a: ");
		Scanner sc =  new Scanner(System.in);
		a = sc.nextDouble();
		System.out.print("Digite o valor da variavel b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor da variavel c: ");
		c = sc.nextDouble();
		if (a==0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
			if (b==0.0) { //com a<>0	
				x1 = Math.sqrt(-c/a);
				delta = (Math.pow(b, 2.0)-(4*a*c));	
				if (delta<0) {
					System.out.println("Impossivel calcular nos reais");
				}
				else {
					System.out.printf("R1 = R2 = %.5f", x1);
				}
			}
			else { //com a e b <> 0
				if (c==0.0) {
					x1 = 0;
					x2 = (-b/a);
					//Função de arredondamento
					System.out.printf("R1 = %.5f e R2 = %.5f", x1, x2);
				}
				else { //a, b e c <>0
				//Lei de ofrmação geral
					delta = ((b*b) - (4*a*c));					
					//escreva("\n", "O discriminate vale: ", delta)
					if (delta<0) {
						System.out.println("Impossivel calcular nos reais");
					}
					else {
						rdelta =  Math.sqrt(delta);
						x1 = ((-b + rdelta) / (2*a));
						x2 = ((-b - rdelta) / (2*a));
						System.out.printf("R1 = %.5f e R2 = %.5f", x1, x2);
					if (delta==0.0) {
						x1 =(-b/a);
						System.out.printf("R1 = R2 = %.5f", x1);
					}
				}
			}
		}
	}

}

}
