package vetor;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Lt02_Vetor07 {

	public static void main(String[] args) {
		int[] vetor = new int [20];
		
		vetor = preencherVetor(vetor);
		System.out.println(Arrays.toString(vetor));
		
		vetor = classificarVetorCrescente(vetor);
		System.out.println("\nVetor classificado");
		System.out.println(Arrays.toString(vetor));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite o valor que deseja buscar: ");
		int valorPesquisado = sc.nextInt();
		sc.close();
		pesquisaVetor(vetor, valorPesquisado);
		
	}
	
	
	public static int[] preencherVetor(int[] array) {
		SecureRandom random = new SecureRandom();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(21);
		}
		
		return array;
	}

	
	public static int[] classificarVetorCrescente(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
		}
		
		return array;
	}
	
	public static boolean pesquisaVetor(int[] array, int busca) {
		int inicio = 0;
		int meio = array.length/2;
		int fim = array.length;
		
		while(inicio <= fim) {
			if (busca == array[meio]) {
				System.out.printf("Valor %d encontrado %nPosição %d ", busca, meio);
				return true;
			}
			else if (busca > array[meio]) {
				inicio = meio + 1;
				meio = (inicio + fim) / 2;
			}
			else {
				fim = meio -1;
				meio = (inicio + fim) / 2;
			}
		}
		
		System.out.println("-1 \nValor não encontrado");
		return false;
	}

}
