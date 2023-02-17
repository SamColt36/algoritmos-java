package beecrowd;

public class Bc1096 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			int j = 7;
			for (int z = 0; z < 3; z++) {
				System.out.println("I=" + i + "   J=" + j);
				j -= 1;
			}
			System.out.println("----------");
		}
	}
}
