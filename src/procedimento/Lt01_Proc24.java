package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc24 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro: ", "Divisível por 2 e 3",
				JOptionPane.QUESTION_MESSAGE));

		divisible(number);

	}

	public static void divisible(int number) {
		if (number % 2 == 0 && number % 3 == 0)
			JOptionPane.showMessageDialog(null, String.format("%d é divisível por 2 e 3.", number),
					"Divisível por 2 e 3", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("%d não é divisível por 2 e 3.", number),
					"Divisível por 2 e 3", JOptionPane.INFORMATION_MESSAGE);

	}

}