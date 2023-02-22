package beecrowd;

public class Bc1097 {

	public static void main(String[] args) {
		int a = 0, j;
		for (int i = 1; i <= 9; i++) {

			if (i % 2 == 0)
				continue;
			else {
				j = 7 + a;
				a += 2;
				for (int z = 0; z < 3; z++) {
					System.out.println("I=" + i + "   J=" + j);
					j -= 1;
				}
			}
			System.out.println("---------");
		}
	}
}
