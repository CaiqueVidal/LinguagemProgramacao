package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx09 {

	public static void main(String[] args) {
	int numero1, numero2, somaDosQuadrados;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite um número inteiro: ");
	numero1 = sc.nextInt();
	System.out.print("Digite outro número inteiro: ");
	numero2 = sc.nextInt();
	sc.close();
	
	somaDosQuadrados = ((numero1 * numero1) + (numero2 * numero2));
	
	System.out.print("A soma dos quadrados é " + somaDosQuadrados);

	}

}
