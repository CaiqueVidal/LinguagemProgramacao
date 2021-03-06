package procedimento;

import javax.swing.JOptionPane;

public class Lt01_Proc28 {

	public static void main(String[] args) {
		double precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o atual"));
		double vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal"));

		novoPreco(precoAtual, vendaMensal);

	}

	public static void novoPreco(double precoAtual, double vendaMensal) {
		double precoNovo = precoAtual; // para outras condi��es, pre�o novo ser� igual ao pre�o atual

		if (vendaMensal < 500.0 && precoAtual < 30)
			precoNovo = precoAtual * 1.10;
		else if (vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >= 30 && precoAtual < 80)
			precoNovo = precoAtual * 1.15;
		else if (vendaMensal >= 1000.0 && precoAtual >= 80)
			precoNovo = precoAtual * 0.95;

		JOptionPane.showMessageDialog(null, String.format("Pre�o novo = R$ %,.2f", precoNovo), "Novo Pre�o do Produto",
				JOptionPane.INFORMATION_MESSAGE);
	}

}