package matriz;


public class Lt02_Matriz10 {

	public static void main(String[] args) {
		double[][] matriz = new double[8][8];
		
		preencherMatriz(matriz);
		exibirMatriz(matriz);
		exibirSomaMatriz(matriz);
	}
	
	
	public static double[][] preencherMatriz(double[][] array) {
		int expoente = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.pow(2, expoente);
				expoente++;
			}
		}
		return array;
	}

	
	public static void exibirMatriz(double[][] array) {
		System.out.printf("%7s %30s%n", "Casa", "Valor");
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				System.out.printf("%5d %,30.0f%n", ++contador, array[i][j]);
		}
	}

	
	public static void exibirSomaMatriz(double[][] array) {
		double soma = 0.0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				soma+= array[i][j];
			}
		}
		
		System.out.printf("%n%10s = %,.0f", "Soma dos valores", soma);
	}
	
}
