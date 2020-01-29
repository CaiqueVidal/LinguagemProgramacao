package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc17 {

	public static void main(String[] args) {
		double tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso"));
		double velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média"));

		litrosGastos(tempoPercurso, velocidadeMedia);

	}

	public static void litrosGastos(double tempoPercurso, double velocidadeMedia) {
		double litrosGastos = tempoPercurso * velocidadeMedia / 12;

		JOptionPane.showMessageDialog(null, String.format("Consumo foi de %,.2f litros.", litrosGastos));

	}
}