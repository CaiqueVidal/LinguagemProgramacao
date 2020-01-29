package vetor;

import java.util.Scanner;

public class Lt02_Vetor03 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		
		System.out.println("Preencha o 1° vetor");
		vetor1 = preencherVetor(vetor1);
		
		System.out.println("\nPreencha o 2° vetor");
		vetor2 = preencherVetor(vetor2);
		
		int[]vetor3 = concatenarVetores(vetor1, vetor2);
		
		exibirVetor(vetor3);
		
		sc.close();
		
	}
	
	
	public static int[] preencherVetor(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d° valor: ", i + 1);
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	
	public static int[] concatenarVetores(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length + array2.length];
		
		for (int i = 0; i < array3.length; i++) {
			if (i < array1.length)
				array3[i] = array1[i];
			else
				array3[i] = array2[i - array1.length];
		}
		
		return array3;
	}

	
	public static void exibirVetor(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
