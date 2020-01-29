package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx07 {

	public static void main(String[] args) {
		double comprimento, largura, altura, volume;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do comprimento do paralelepipedo: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor da largura do paralelepipedo: ");
		largura = sc.nextDouble();
		System.out.print("Digite o valor da altura do paralelepipedo: ");
		altura = sc.nextDouble();
		sc.close();
		
		volume = (comprimento * largura * altura);
		
		System.out.printf("Volume = %,.1f", volume);
		
	}

}
