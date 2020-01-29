package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx33 {

	public static void main(String[] args) {
		int numero;
		double resultadoSerie = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= numero; i++) {
			resultadoSerie += 1 / (double) i;
		}
		
		System.out.printf("Resultado da s�rie = %,.3f",resultadoSerie);
		
	}

}
