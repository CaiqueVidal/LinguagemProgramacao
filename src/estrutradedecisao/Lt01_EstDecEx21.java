package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx21 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, media;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da 1° nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite o valor da 2° nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite o valor da 3° nota: ");
		nota3 = sc.nextDouble();
		System.out.print("Digite o valor da 4° nota: ");
		nota4 = sc.nextDouble();
		sc.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;

		if(media >= 6) {
			System.out.println("Média " + media + " - Aprovado");
		}
		else if(media >= 3) {
			System.out.println("Média " + media + " - Exame");
		}
		else {
			System.out.println("Média " + media + " - Retido");
		}
		
	}

}
