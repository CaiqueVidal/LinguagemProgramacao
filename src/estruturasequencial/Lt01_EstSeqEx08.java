package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx08 {
	public static void main (String[] args) {
		double valorDeposito;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do dep�sito em poupan�a: ");
		valorDeposito = sc.nextDouble();
		sc.close();
		
		valorDeposito *= 1.013;
		
		System.out.printf("Rendimento ap�s um m�s = R$ %,.2f", valorDeposito);
		
	}

}
