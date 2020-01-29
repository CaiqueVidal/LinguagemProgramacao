package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx17 {

	public static void main(String[] args) {
		double tempoPercurso, velocidadeMedia, litrosGastos;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Tempo gasto no percurso: ");
		tempoPercurso = sc.nextDouble();
		System.out.print("Velocidade média: ");
		velocidadeMedia = sc.nextDouble();
		sc.close();
		
		litrosGastos = (tempoPercurso/60) * velocidadeMedia / 12; 
		
		System.out.printf("O consumo foi aproximadamente de %,.2f litros", litrosGastos);
		
	}

}
