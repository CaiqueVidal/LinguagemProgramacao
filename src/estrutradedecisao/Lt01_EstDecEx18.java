package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx18 {

	public static void main(String[] args) {
		int valor1, valor2, diferenca;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		valor1 = sc.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		valor2 = sc.nextInt();
		sc.close();

		if (valor1 > valor2) {
			diferenca = valor1 - valor2;
		}
		else {
			diferenca = valor2 - valor1;
		}
		
		System.out.println("A diferen�a dos n�meros � " + diferenca);
		
	}

}
