package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx04 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = sc.nextDouble();
		sc.close();
		
		fahrenheit = (9 * celsius + 160) / 5;

		System.out.printf("%,.1f °C = %,.1f °F", celsius, fahrenheit);

	}

}
