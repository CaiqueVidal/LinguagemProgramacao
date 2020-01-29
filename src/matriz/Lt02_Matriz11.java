package matriz;

public class Lt02_Matriz11 {

	public static void main(String[] args) {
		int[][] matriz = new int[8][8];
		
		matriz = espiral(matriz);
		exibirMatriz(matriz);
			
	}

	
	public static int[][] espiral(int[][] array) {
		for (int i = 1; i <= 4; i++) {
			for (int linha = (i - 1); linha <= (array.length - i); linha++) {
				for (int coluna = (i - 1); coluna <= (array.length - i); coluna++)
					array[linha][coluna] = i;
			}
		}

		return array;

	}

	
	public static void exibirMatriz(int[][] array) {
		String exibicaoMatriz = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				exibicaoMatriz += array[i][j] + "  ";
			exibicaoMatriz += "\n";
		}

		System.out.print(exibicaoMatriz);
	}


}
