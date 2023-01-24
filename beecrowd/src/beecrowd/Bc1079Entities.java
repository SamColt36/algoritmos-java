package beecrowd;

public class Bc1079Entities {

	private Double nota1, nota2, nota3;

	public Bc1079Entities() {
	}

	public Bc1079Entities(Double nota1, Double nota2, Double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public Double media() {
		return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
	}
}
