package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx01 {

	public static void main(String[] args) {
		double lado, areaQuadrado;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do lado do quadrado: ");
		lado = sc.nextDouble();
		sc.close();
		
		areaQuadrado = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é de " + areaQuadrado + " cm²");
		
	}

}
