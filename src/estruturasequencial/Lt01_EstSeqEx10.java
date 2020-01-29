package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx10 {

	public static void main(String[] args) {
		double numero1, numero2, diferenca;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de um número: ");
		numero1 = sc.nextDouble();
		System.out.print("Digite o valor de outro número: ");
		numero2 = sc.nextDouble();
		sc.close();
		
		diferenca = numero1 -numero2;
		
		System.out.printf("A diferença dos números é de %,.1f", Math.abs(diferenca));

	}

}
