package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx13 {

	public static void main(String[] args) {
		double alimentoKg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de alimento (em quilos): ");
		alimentoKg = sc.nextDouble();
		sc.close();
		
		System.out.printf("O Alimento durará %d dias", Math.round((alimentoKg*1000) / 50));

	}

}
