package funcao;

public class Lt01_Func45 {

	public static void main(String[] args) {
		System.out.printf("Resultado da série = %,.2f", calculaSerie());

	}

	public static double calculaSerie() {
		double serie = 0;

		for (int i = 1; i <= 15; i++)
			serie += i / Math.pow(i, 2);

		return serie;
	}

}