package funcao;

public class Lt01_Func31 {

	public static void main(String[] args) {
		for (int i = 11; i < 150; i++)
			System.out.printf("%d² = %d%n", i, calculaQuadrado(i));

	}

	public static int calculaQuadrado(int number) {
		return number * number;
	}

}