package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx32 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = sc.nextInt();
		sc.close();
		
		int fat = 1;

		for (int i = numero; i > 1; i--) {
			fat *= i;
		}
		
		System.out.printf("%d! = %d", numero, fat);
		
	}

}
