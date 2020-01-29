package sistemadetransito;

import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuEstatistica {

	public static void main(String[] args) throws IOException {
		final int TOTAL_DE_ESTATISTICAS = 5;
		Estatistica[] estatisticas = new Estatistica[TOTAL_DE_ESTATISTICAS];

		String mensagemMenu = "Estat�sticas de acidentes em 2019\n\n" + "1 - Cadastro Estat�stica\n"
				+ "2 - Consulta por tipo de ve�culo\n" + "3 - Consulta por quantidade de acidentes\n"
				+ "4 - Consulta todos as cidades\n" + "5 - Consulta maior menor m�dia de acidentes\n"
				+ "9 - Finaliza\n\n";

		int opcao;

		do {
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog(null, mensagemMenu, "MENU ESTAT�STICA", JOptionPane.QUESTION_MESSAGE));

			switch (opcao) {
			case 1:
				estatisticas = ClasseMetodos.cadastrarEstatistica(estatisticas);
				break;
			case 2:
				ClasseMetodos.consultarPorTipoDeVeiculo(estatisticas);
				break;
			case 3:
				ClasseMetodos.consultarPorQtdAcidentes(estatisticas);
				break;
			case 4:
				ClasseMetodos.consultarTodasCidades(estatisticas);
				break;
			case 5:
				ClasseMetodos.consultarGeral(estatisticas);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Encerrando ..");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!", "Error", JOptionPane.ERROR_MESSAGE);
				break;
			}
		} while (opcao != 9);
	}

}