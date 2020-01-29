package funcao;

public class Lt01_Func39 {

	public static void main(String[] args) {
		System.out.println(graosTabuleiroXadrez());

	}

	public static String graosTabuleiroXadrez() {
		String tabela = String.format(" %4s%14s%n", "Casa", "N. grãos");

		for (int i = 0; i < 64; i++)
			tabela += String.format("  %02d\t\t%,.0f%n", i + 1, Math.pow(2, i));

		return tabela;
	}

}