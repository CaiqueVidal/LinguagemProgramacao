package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc19 {

	public static void main(String[] args) {
		double number1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um n�mero real",
				" Maior de Dois N�meros", JOptionPane.PLAIN_MESSAGE));
		double number2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro real:",
				"Maior de Dois N�meros", JOptionPane.PLAIN_MESSAGE));

		larger(number1, number2);

	}

	public static void larger(double number1, double number2) {
		if (number1 > number2)
			JOptionPane.showMessageDialog(null, String.format("O maior � %,.2f", number1), "Maior de Dois N�meros",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("O maior � %,.2f", number2), "Maior de Dois N�meros",
					JOptionPane.INFORMATION_MESSAGE);
	}

}