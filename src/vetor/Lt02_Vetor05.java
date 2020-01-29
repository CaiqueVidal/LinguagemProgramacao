package vetor;

import java.util.Scanner;

public class Lt02_Vetor05 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		
		vetor = preencherVetor(vetor);
		calcularVetor (vetor);
		
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
	
	
	public static void calcularVetor(int[] array) {
		int soma = 0;
		
		for(int i = 0; i < array.length/2; i++) {
			soma += array[i] - array[i + array.length/2];
		}
		
		System.out.print("O resultado é " + soma);
		
	}

}
