package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx36 {

	public static void main(String[] args) {
		int numero;
		double resultadoSerie = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= numero; i++) {

			int fatorial = 1;
			for (int j = i; j > 1; j--)
				fatorial *= j;

			resultadoSerie += (double) 1 / fatorial;
		}

		System.out.printf("O resultado da série é %,.2f", resultadoSerie);
		
	}

}
