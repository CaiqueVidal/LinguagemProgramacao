package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx23 {

	public static void main(String[] args) {
		double numero1, numero2, numero3, numero4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite outro número maior que o 1°: ");
		numero2 = sc.nextDouble();
		System.out.println("Digite outro número maior que o 2°: ");
		numero3 = sc.nextDouble();
		if(numero1 < numero2 && numero2 < numero3) {
			System.out.println("Digite outro número: ");
			numero4 = sc.nextDouble();
			if(numero4 < numero1) {
				System.out.printf("Ordem crescente %n %,.1f   %,.1f   %,.1f   %,.1f", numero4, numero1, numero2, numero3);
			}
			else if (numero4 < numero2) {
				System.out.printf("Ordem crescente %n %,.1f   %,.1f   %,.1f   %,.1f", numero1, numero4, numero2, numero3);
			}
			else if (numero4 < numero3) {
				System.out.printf("Ordem crescente %n %,.1f   %,.1f   %,.1f   %,.1f", numero1, numero2, numero4, numero3);
			}
			else {
				System.out.printf("Ordem crescente %n %,.1f   %,.1f   %,.1f   %,.1f", numero1, numero2, numero3, numero4);
			}
		} else {
			System.out.println("Os valores não foram inseridos corretamente!");
		}
		
		
		
		sc.close();
		

	}

}
