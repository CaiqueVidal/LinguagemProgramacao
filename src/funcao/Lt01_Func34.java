package funcao;

import javax.swing.JOptionPane;

public class Lt01_Func34 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		JOptionPane.showMessageDialog(null, resultaTabuada(number), "Tabuada do " + number,
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static String resultaTabuada(int number) {
		String result = "";

		for (int i = 1; i <= 10; i++)
			result += number + " x " + i + " = " + (number * i) + "\n";

		return result;

	}

}
