package vetor;

import java.security.SecureRandom;
import java.util.Arrays;

public class Lt02_Vetor06 {

	public static void main(String[] args) {
		int[] vetor = new int [20];
		
		vetor = preencherVetor(vetor);
		System.out.println(Arrays.toString(vetor));
		
		
		vetor = classificarVetorCrescente(vetor);
		System.out.println("\nVetor classificado");
		System.out.println(Arrays.toString(vetor));
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
	
	
}
