package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx14 {

	public static void main(String[] args) {
		int angulo1, angulo2, angulo3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do 1� �ngulo do tri�ngulo: ");
		angulo1 = sc.nextInt();
		System.out.print("Digite o valor do 2� �ngulo do tri�ngulo: ");
		angulo2 = sc.nextInt();
		sc.close();
		
		angulo3 = (180 - (angulo1 + angulo2));

		System.out.print("O 3� �ngulo � " + angulo3);
		
	}

}
