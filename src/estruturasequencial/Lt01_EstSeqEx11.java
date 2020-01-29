package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx11 {

	public static void main(String[] args) {
		double raioCircunferencia, comprimentoCircunferencia;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do raio da circunferência: ");
		raioCircunferencia = sc.nextDouble();
		sc.close();
		
		comprimentoCircunferencia = 2 * Math.PI * raioCircunferencia;
		
		System.out.printf("Comprimento da circunferência é %,.1f m", comprimentoCircunferencia);

	}

}
