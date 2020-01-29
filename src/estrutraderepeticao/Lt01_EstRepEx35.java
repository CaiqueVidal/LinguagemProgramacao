package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx35 {

	public static void main(String[] args) {
		int numero1, numero2, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero1 = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		numero2 = sc.nextInt();
		sc.close();
		
		if (numero1 > numero2) {
			for(int i = numero2+1; i<numero1; i++) {
				if(i % 2 == 1) {
					soma += i;
				}
			}
		}
		else {
			for(int i = numero1+1; i<numero2; i++) {
				if(i % 2 == 1) {
					soma += i;
				}
			}
		}
		
		System.out.printf("A soma dos números ímpares entre %d e %d = %d", numero1, numero2, soma);
		
	}

}
