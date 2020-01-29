package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx19 {

	public static void main(String[] args) {
		double valor1, valor2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite outro número: ");
		valor2 = sc.nextDouble();
		sc.close();
		
		if (valor1 > valor2) {
			System.out.print("O número " + valor1 + " é o maior");
		}
		else {
			System.out.print("O número " + valor2 + " é o maior");
		}
		
	}

}
