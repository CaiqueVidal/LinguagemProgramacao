package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx10 {

	public static void main(String[] args) {
		double numero1, numero2, diferenca;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de um n�mero: ");
		numero1 = sc.nextDouble();
		System.out.print("Digite o valor de outro n�mero: ");
		numero2 = sc.nextDouble();
		sc.close();
		
		diferenca = numero1 -numero2;
		
		System.out.printf("A diferen�a dos n�meros � de %,.1f", Math.abs(diferenca));

	}

}
