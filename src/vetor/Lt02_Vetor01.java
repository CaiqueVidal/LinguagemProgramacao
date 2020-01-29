package vetor;

import java.util.Scanner;

public class Lt02_Vetor01 {

	public static void main(String[] args) {
		int[] vetor = new int[50];

		vetor = preencherVetor(vetor);
		valorMedia(vetor);
		somaImpar(vetor);
		
	}

	
	public static int[] preencherVetor(int[] array) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d° Valor: ", i + 1);
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		return array;
	}

	
	public static void valorMedia(int[] array) {
		double media = 0;
		double contador = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10 && array[i] < 200) {
				contador++;
				media += array[i];
			}
		}
		
		media = media / contador;

		System.out.printf("Média dos valores entre 10 e 200 = %,.1f%n", media);
	}

	
	public static void somaImpar(int[] array) {
		int soma = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				soma += array[i];
		}

		System.out.printf("Soma dos números ímpares = %d", soma);
	}

	
}
