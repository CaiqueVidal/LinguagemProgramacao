package funcao;

public class Lt01_Func42 {

	public static void main(String[] args) {
		System.out.printf("Summation of the series is: %,.2f", calculaSerie());

	}

	public static double calculaSerie() {
		double series = 0;
		int odd = 1;
		for (int i = 1; i <= 50; i++) {
			series += (double) i / odd;
			odd += 2;
		}

		return series;
	}

}