package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx03 {

	public static void main(String[] args) {
		double baseTriangulo, alturaTriangulo, areaTriangulo;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base do triângulo: ");
		baseTriangulo = sc.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		alturaTriangulo = sc.nextDouble();
		sc.close();
		
		areaTriangulo = baseTriangulo * alturaTriangulo / 2;
		
		System.out.printf("A área do triângulo é %,.1f cm²", areaTriangulo);
		
	}

}
