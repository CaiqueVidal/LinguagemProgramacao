package vetor;

import java.util.Scanner;

public class Lt02_Vetor04 {

	public static void main(String[] args) {
		double[] vetor = new double[30];
		
		vetor = preencherVetor(vetor);
		double media = valorMedia(vetor);
		System.out.printf("%nMédia = %,.2f %n", media);
		notasAcimaMedia(media, vetor);
		posicoesAbaixoMedia(vetor, media);
		
	}
	
	
	public static double[] preencherVetor(double[] array) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d° valor: ", i + 1);
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		return array;
	}
	
	
	public static double valorMedia(double[] array) {
		double media = 0;
		
		for(int i =0; i < array.length; i++) {
			media += array[i];
		}
		
		media = media / array.length;
		
		return media;
	}
	
	
	public static void notasAcimaMedia(double media, double[] array) {
		int contador = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] > media) {
				contador ++;
			}
		}
		
		System.out.printf("%n%d nota(s) acima da média %n", contador);
	}
	
	
	public static void posicoesAbaixoMedia(double[]array, double media ) {
		System.out.println("\nAbaixo da média");
		for(int i = 0; i < array.length; i++) {
			if (array[i] < media) {
				System.out.println("Posição " + i);
			}
		}
	}
	
}


