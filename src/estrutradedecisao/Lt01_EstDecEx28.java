package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx28 {

	public static void main(String[] args) {
		double precoAtual, precoNovo;
		int mediaMensal;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o preço atual do produto: ");
		precoAtual = sc.nextDouble();
		System.out.print("Digite a média de venda mensal do produto: ");
		mediaMensal = sc.nextInt();
		sc.close();
		
		precoNovo = precoAtual;

		if (mediaMensal < 500.0 && precoAtual < 30.0)
			precoNovo = precoAtual * 1.10;
		else if (mediaMensal >= 500.0 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80)
			precoNovo = precoAtual * 1.15;
		else if (mediaMensal >= 1000 && precoAtual >= 80)
			precoNovo = precoAtual * 0.95;

		System.out.printf("Novo preço é R$ %,.2f", precoNovo);
	
	}

}
