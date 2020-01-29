package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx22 {

	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		numero1 = sc.nextInt();
		System.out.println("Digite outro número inteiro diferente: ");
		numero2 = sc.nextInt();
		sc.close();
		
		if (numero1 == numero2) {
			System.out.print("Valor inválido - os números devem ser diferentes");
		}
		else if (numero1 > numero2) {
			System.out.println("Ordem crescente \n" + numero2 + ", " + numero1);
		}
		else {
			System.out.println("Ordem crescente \n" + numero1 + ", " + numero2);
		}
		
	}

}
