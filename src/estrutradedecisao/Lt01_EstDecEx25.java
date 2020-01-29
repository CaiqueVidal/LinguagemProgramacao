package estrutradedecisao;

import java.util.Scanner;

public class Lt01_EstDecEx25 {

	public static void main(String[] args) {
		int horaInicial, minutoInicial, horaFinal, minutoFinal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Horário inicial do jogo");
		System.out.print("Digite a hora: ");
		horaInicial = sc.nextInt();
		System.out.print("Digite os minutos: ");
		minutoInicial = sc.nextInt();
		System.out.println("Horário final do jogo");
		System.out.print("Digite a hora: ");
		horaFinal = sc.nextInt();
		System.out.print("Digite os minutos: ");
		minutoFinal = sc.nextInt();
		sc.close();
		
		if (horaInicial < 0 || horaInicial > 23 || horaFinal < 0 || horaFinal > 23 || minutoInicial < 0 || minutoInicial > 59
				|| minutoFinal < 0 || minutoFinal > 59)
			System.out.printf("%nHorário(s) invalído(s)");
		else {
			int diferencaHora = horaFinal - horaInicial;
			int diferencaMinuto = minutoFinal - minutoInicial;

			if (diferencaMinuto < 0) {
				diferencaHora--;
				diferencaMinuto = 60 + diferencaMinuto;
			}

			if (diferencaHora < 0)
				diferencaHora = 24 + diferencaHora;

			if (diferencaHora == 0 && diferencaMinuto == 0)
				diferencaHora = 24;

			System.out.printf("%nO JOGO DUROU %02d:%02d%n", diferencaHora, diferencaMinuto);
		}

	}

}
