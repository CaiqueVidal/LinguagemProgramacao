package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx06 {

	public static void main(String[] args) {
		int x, y, aux;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de y: ");
		y = sc.nextInt();
		sc.close();
		
		aux = x;
		x = y;
		y = aux;
		
		System.out.println("Valor de x = " + x);
		System.out.println("Valor de y = " + y);
		
	}

}
