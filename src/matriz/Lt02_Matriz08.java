package matriz;

import java.util.Scanner;

public class Lt02_Matriz08 {

	public static void main(String[] args) {
		int[][] matriz = new int [4][3]; 
		
		matriz = preencherMatriz(matriz);
		exibirMatriz(matriz);
		quantidadeProdutoMes(matriz);
		quantidadeVendidoSemana(matriz);
		quantidadeVendidoMes(matriz);
		
	}

	
	public static int[][] preencherMatriz(int[][] array) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++ ) {
				System.out.printf("%d° semana, produto %d: ", i+1, j+1);
				array[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
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
	
	
	public static void quantidadeProdutoMes (int[][] array) {
		int[] produtos = new int [array[0].length];

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++)
				produtos[j] += array[i][j];
		}

		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("Produto %d vendeu = %d%n", i + 1, produtos[i]);
		}
		System.out.println();
		
	}
	
	
	public static void quantidadeVendidoSemana (int[][] array) {
		for(int i = 0; i < array.length; i ++) {
			int totalSemana = 0;
			for(int j = 0; j < array[i].length; j++) {
				totalSemana += array[i][j]; 
			}	
			System.out.printf("%d° Semana vendeu %d produtos %n", i+1, totalSemana);
		}
		System.out.println();
	}
	
	
	public static void quantidadeVendidoMes (int[][] array) {
		int totalMes = 0;
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				totalMes += array[i][j]; 
			}
		}
		System.out.printf("Foram vendidos %d neste mês", totalMes);
	}
	
	
}
