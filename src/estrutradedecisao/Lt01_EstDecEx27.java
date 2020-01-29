package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx27 {

	public static void main(String[] args) {
		int numeroVoltas;
		double tempoDuracao, extensaoCircuito, velocidadeMedia;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o n�mero de voltas do circuito: ");
		numeroVoltas =  sc.nextInt();
		System.out.print("Digite a extens�o do circuito (em metros): ");
		extensaoCircuito = sc.nextDouble();
		System.out.print("Digite o tempo de dura��o (em minutos): ");
		tempoDuracao =  sc.nextInt();
		sc.close();
		
		extensaoCircuito /= 1000; 
		tempoDuracao = tempoDuracao / 60; 
		velocidadeMedia = (extensaoCircuito * numeroVoltas) / tempoDuracao;

		System.out.printf("Velocidade m�dia = %,.0f km/h.", velocidadeMedia);
		
	}

}
