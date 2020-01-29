package matriz;

import java.security.SecureRandom;

public class Lt02_Matriz12 {
	
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {

		int[][] tabuleiro = new int[8][8];

		tabuleiro = preencherTabuleiro(tabuleiro);
		exibirTabuleiro(tabuleiro);
		somaPecas(tabuleiro);

	}

	public static int[][] preencherTabuleiro(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = 1 + random.nextInt(7);
		}

		return array;
	}


	public static void exibirTabuleiro(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}

			System.out.println();
		}
	}
	
	
	public static void somaPecas(int[][] array) {
		int[] contadorPecas = new int[7];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				contadorPecas[array[i][j]-1]++;
		}

		for (int i = 0; i < contadorPecas.length; i++)
			System.out.printf("%d = %d%n", i+1, contadorPecas[i]);

	}

}
