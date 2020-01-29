package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func32 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Fatorial",
				JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("%,d ! = %,d", number, factorial(number)), "Fatorial",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static int factorial(int number) {
		int fat = 1;

		for (int i = 1; i <= number; i++)
			fat *= i;

		return fat;

	}

}