package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx24 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		sc.close();
		
		if (numero % 2 == 0 && numero % 3 == 0) {
			System.out.printf("O n�mero %d � divis�vel por 2 e 3", numero);
		}
		else {
			System.out.printf("O n�mero %d n�o � divis�vel por 2 e 3", numero);
		}

	}

}
