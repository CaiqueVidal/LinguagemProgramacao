package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx40 {

	public static void main(String[] args) {
		int numero1, numero2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero1 = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		numero2 = sc.nextInt();
		sc.close();
		
		if(numero1 < numero2) {
			int aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}

		for (int i = numero1 - 1; i > numero2; i--) {
			int aux = 0;
			for (int j = i-1; j > 0; j--) {
				if (i % j == 0) {
					aux++;
				}
			}
			if (aux == 1) {
				System.out.println(i);
			}
		}

	}

}
