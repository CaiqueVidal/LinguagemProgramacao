package funcao;

public class Lt01_Func41 {

	public static void main(String[] args) {
		System.out.println(dadoPossibilidade());
	}

	public static String dadoPossibilidade() {
		String possibilidades = "";

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 7)
					possibilidades += String.format("%d + %d = %d%n", i, j, i + j);
			}
		}

		return possibilidades;
	}

}