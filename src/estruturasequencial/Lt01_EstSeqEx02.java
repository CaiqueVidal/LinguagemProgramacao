package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx02 {

	public static void main(String[] args) {
		double salario, salarioReajustado;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do s�lario: ");
		salario = sc.nextDouble();
		sc.close();
		
		salarioReajustado = salario * 1.15;
		
		System.out.printf("S�lario com 15%% de reajuste =  R$ %.2f", salarioReajustado);

	}

}
