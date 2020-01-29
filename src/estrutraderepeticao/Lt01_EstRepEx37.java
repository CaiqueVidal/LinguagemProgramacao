package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx37 {

	public static void main(String[] args) {
		int termo, numeroAnterior= 0, numeroAtual = 1;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		termo = sc.nextInt();
		sc.close();

		System.out.printf("Série Fibonacci até o %d° termo  %n", termo);
		
		for (int i = 0; i < termo; i++) {
			if (i <= 1)
				System.out.print(i + " ");
			else {
				int numProximo = numeroAnterior + numeroAtual;

				System.out.printf("%d ", numProximo);

				numeroAnterior = numeroAtual;
				numeroAtual = numProximo;
			}

		}
		
	}

}
