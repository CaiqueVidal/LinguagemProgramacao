package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc26 {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro inteiro"));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo inteiro"));

		multiplo(number1, number2);

	}

	public static void multiplo(int number1, int number2) {
		if (number1 > number2) {
			if (number1 % number2 == 0)
				JOptionPane.showMessageDialog(null, String.format("%d � m�ltiplo do %d", number1, number2));
			else
				JOptionPane.showMessageDialog(null, String.format("%d n�o � m�ltiplo do %d", number1, number2));

		} else {
			if (number2 % number1 == 0)
				JOptionPane.showMessageDialog(null, String.format("%d � m�ltiplo do %d", number2, number1));
			else
				JOptionPane.showMessageDialog(null, String.format("%d n�o � m�ltiplo do %d", number2, number1));
		}

	}

}