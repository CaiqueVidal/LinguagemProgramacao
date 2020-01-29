package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx38 {

	public static void main(String[] args) {
		int maiorNumero, menorNumero, aux;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		aux = sc.nextInt();
		menorNumero = aux;
		maiorNumero = aux;
		
		for(int i = 1; i < 10; i++) {
			System.out.print("Digite outro número inteiro: ");
			aux = sc.nextInt();
			if (menorNumero > aux) {
				menorNumero = aux;
			}
			else if (maiorNumero < aux) {
				maiorNumero = aux;
			}
			
		}
		
		sc.close();
		
		System.out.printf("Maior número %d %nMenor número %d", maiorNumero, menorNumero);
		
	}

}
