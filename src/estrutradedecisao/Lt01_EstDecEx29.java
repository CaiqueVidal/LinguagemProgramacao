package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx29 {

	public static void main(String[] args) {
		int tipoInvestimento;
		double valorInvestimento;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tipo investimento \n1 = poupança e 2 = renda fixa");
		System.out.print("Digite o tipo de investimento: ");
		tipoInvestimento = sc.nextInt();
		System.out.print("Digite o valor do investimento: ");
		valorInvestimento = sc.nextDouble();
		sc.close();
		
		if (tipoInvestimento == 1) {
			System.out.print("\nO valor corrigido após 30 dias será de " + (valorInvestimento * 1.03));
		}
		else if (tipoInvestimento == 2){
			System.out.print("\nO valor corrigido após 30 dias será de " + (valorInvestimento * 1.05));
		}
		else {
			System.out.print("\nTipo inválido!");
		}
		
	}

}
