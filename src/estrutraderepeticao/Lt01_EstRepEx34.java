package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx34 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		sc.close();
		
		for(int i = 0; i <=10; i++) {
			System.out.printf("%d x %d = %d%n", numero, i, numero * i);
		}
		
	}

}
