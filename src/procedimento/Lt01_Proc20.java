package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc20 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C"));

		calculaEquacao2Grau(a, b, c);

	}

	// Verifiqua e mostra a exist�ncia de ra�zes reais e se caso exista, calcula e
	// mostra
	public static void calculaEquacao2Grau(int a, int b, int c) {

		// calcula delta
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) // coeficiente 'A' n�o pode ser igual a zero
			JOptionPane.showMessageDialog(null,
					String.format("Exception: n�o � uma equa��o do 2� grau - 'A' inval�do!"), "Solu��o da Equa��o",
					JOptionPane.ERROR_MESSAGE);
		else if (delta > 0) { // duas ra�zes
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = %,.0f%nX\" = %,.0f ", x1, x2), "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (delta == 0) { // ra�z �nica
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			JOptionPane.showMessageDialog(null, String.format("X' = X\" = %,.0f", x1), "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);
		} else // (delta < 0) nenhuma raiz
			JOptionPane.showMessageDialog(null, "Equa��o n�o possui ra�zes reais... ", "Solu��o da Equa��o",
					JOptionPane.INFORMATION_MESSAGE);

	}

}