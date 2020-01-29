package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx15 {

	public static void main(String[] args) {
		int cateto1, cateto2;
		double hipotenusa;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do 1� cateto do tri�ngulo: ");
		cateto1 = sc.nextInt();
		System.out.println("Digite o valor do 2� cateto do tri�ngulo: ");
		cateto2 = sc.nextInt();
		sc.close();

		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.printf("Hipotenusa = %,.0f cm", hipotenusa);
		
	}

}
