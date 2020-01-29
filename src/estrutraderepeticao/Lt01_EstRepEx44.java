package estrutraderepeticao;

import java.util.Scanner;

public class Lt01_EstRepEx44 {

	public static void main(String[] args) {
		int base, expoente, resultadoPotencia;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores da potência");
		System.out.print("base: ");
		base = sc.nextInt();
		System.out.print("expoente: ");
		expoente = sc.nextInt();
		sc.close();

		resultadoPotencia = 1;
		
		for (int i = 0; i < expoente; i++) {
			resultadoPotencia *= base;

		}
		
		System.out.printf("%d ^ %d = %d", base, expoente, resultadoPotencia);

	}

}