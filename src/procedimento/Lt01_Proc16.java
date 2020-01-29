package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc16 {

	public static void main(String[] args) {
		double horasTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
		double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
		double numeroDescendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de descendentes"));

		calculaSalario(horasTrabalhadas, valorHora, percentualDesconto, numeroDescendentes);
	}

	public static void calculaSalario(double horasTrabalhadas, double valorHora, double percentualDesconto,
			double numeroDescendentes) {

		double salario = ((horasTrabalhadas * valorHora) - percentualDesconto) + 100 * numeroDescendentes;

		JOptionPane.showMessageDialog(null, String.format("Sal�rio a receber R$ %,.2f", salario), "Sal�rio",
				JOptionPane.INFORMATION_MESSAGE);

	}

}