package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx03 {

	public static void main(String[] args) {
		double baseTriangulo, alturaTriangulo, areaTriangulo;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base do tri�ngulo: ");
		baseTriangulo = sc.nextDouble();
		System.out.print("Digite o valor da altura do tri�ngulo: ");
		alturaTriangulo = sc.nextDouble();
		sc.close();
		
		areaTriangulo = baseTriangulo * alturaTriangulo / 2;
		
		System.out.printf("A �rea do tri�ngulo � %,.1f cm�", areaTriangulo);
		
	}

}
