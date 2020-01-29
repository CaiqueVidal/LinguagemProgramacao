package funcao;

public class Lt01_Func43 {

	public static void main(String[] args) {
		System.out.print(anosNecessarios());

	}

	public static int anosNecessarios() {
		double ana = 1.10;
		double maria = 1.50;
		int ano = 0;

		while (ana < maria) {
			ano++;
			ana += 0.03;
			maria += 0.02;
		}

		return ano;
	}

}