package vetor;

import java.util.Scanner;

public class Lt02_Vetor02 {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		vetor = preencherVetor(vetor);
		valorMaiorMenor(vetor);
		valorMedia(vetor);
		
	}

	
	public static int[] preencherVetor(int[] array) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d° valor: ", i + 1);
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		return array;
	}
	
	
	public static void valorMaiorMenor(int[] array) {
		int maiorValor = array[0];
		int menorValor = array[0];
		
		for(int i =1; i < array.length; i++) {
			if (array[i] > maiorValor) {
				maiorValor = array[i];
			}
			else if (array[i] < menorValor) {
				menorValor = array[i];
			}
		}
		
		System.out.printf("O maior valor é %d %nO menor valor é %d %n", maiorValor, menorValor);
	}
	
	
	public static void valorMedia(int[] array) {
		double media = 0;
		
		for(int i =0; i < array.length; i++) {
			media += array[i];
		}
		
		media = media / array.length;
		
		System.out.printf("A média dos valores é %,.2f", media);
	}
	
}
