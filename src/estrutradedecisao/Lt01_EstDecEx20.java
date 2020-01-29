package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx20 {

	public static void main(String[] args) {
		
		int a, b, c;
		double delta, raiz1, raiz2; 
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente A: ");
		a = sc.nextInt();
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente B: ");
		b = sc.nextInt();
		System.out.print("Em uma equação de 2° grau \nDigite o coeficiente C: ");
		c= sc.nextInt();
		sc.close();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta > 0) {
			raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
			raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("X' = %,.0f%nX\" = %,.0f ", raiz1, raiz2);
		}
		else if (delta == 0) {	
			raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.printf("X' = X\" = %,.0f", raiz1);
		}
		else {
			System.out.println("Equação não possui raízes reais");
		}
		
	}

}
