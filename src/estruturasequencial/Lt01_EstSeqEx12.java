package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx12 {

	public static void main(String[] args) {
		int anoNascimento, anoAtual, idade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o ano do seu nascimento: ");
		anoNascimento = sc.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		sc.close();
		
		idade = (anoAtual - anoNascimento);
		
		System.out.printf("Voc� tem %d anos %nDaqui 17 anos ter� %d", idade, (idade+17));

	}

}
