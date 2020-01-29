package matriz;

import java.security.SecureRandom;

public class Lt02_Matriz09 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		
		matriz= preencherMatriz(matriz);
		exibirMatriz(matriz);
		
		
	}

	
	public static int[][] preencherMatriz(int[][] array) {
		SecureRandom random = new SecureRandom();
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++ ) {
				if (i == j && i == 0) {
					array[i][j] = 1;
				}
				else if (i == j && i > 0) {
					array[i][j] = array[i-1][j-1] * 4;
				}
				else {
					;
					array[i][j] = random.nextInt(10);	
				}
				
			}
		}
		
		return array;
	}
	
	
	public static void exibirMatriz(int[][] array) {
		System.out.println("\nMatriz");
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
}
