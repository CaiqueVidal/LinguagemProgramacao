package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx05 {

	public static void main(String[] args) {
		int a, b, c;
		double raiz1, raiz2; 
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente A: ");
		a = sc.nextInt();
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente B: ");
		b = sc.nextInt();
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente C: ");
		c= sc.nextInt();
		sc.close();
		
		raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		System.out.printf("Raiz 1: %,.1f%n", raiz1);
		System.out.printf("Raiz 2: %,.1f", raiz2);

	}

}
