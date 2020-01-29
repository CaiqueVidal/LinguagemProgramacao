package estruturasequencial;

import java.util.Scanner;

public class Lt01_EstSeqEx16 {

	public static void main(String[] args) {
		double horasTrabalhada, valorHoraTrabalhada, percentualDesconto, salarioBruto, salarioLiquido, salarioFinal;
		int dependentes;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de horas trabalhada: ");
		horasTrabalhada = sc.nextDouble();
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHoraTrabalhada = sc.nextDouble();
		System.out.println("Digite o percentual de desconto: ");
		percentualDesconto = sc.nextDouble();
		System.out.println("Digite o número de dependentes: ");
		dependentes = sc.nextInt();
		sc.close();
		
		salarioBruto = (horasTrabalhada * valorHoraTrabalhada);
		salarioLiquido = salarioBruto - (salarioBruto * (percentualDesconto/100));
		salarioFinal = salarioLiquido + (dependentes * 100);
		
		System.out.printf("Sálario bruto = %,.2f %nSálario Líquido = %,.2f %nSálario a receber = %,.2f"
				, salarioBruto, salarioLiquido, salarioFinal);
		
	}

}
