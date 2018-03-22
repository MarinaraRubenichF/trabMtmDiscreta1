import funcoes.Funcao1;
import funcoes.Funcao2;

import javax.swing.*;

public class Interface extends JFrame {
	private JSpinner spnValor;
	private JSpinner spnMaxX;
	private JPanel pnlFunc1;
	private JPanel pnlFunc2;
	private JPanel content;

	private Interface() {
		setContentPane(content);
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null); //centraliza
		setVisible(true); //exibe
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //finaliza o processo ao fechar a janela

		spnValor.addChangeListener(e -> recalcular());
		spnMaxX.addChangeListener(e -> recalcular());
	}

	public static void main(String[] args) {
		new Interface().spnMaxX.setValue(10);

	}

	@SuppressWarnings("DanglingJavadoc")
	private void recalcular() {
		//atualiza os gráficos
		int alfa = (int) spnValor.getValue();
		int maxX = (int) spnMaxX.getValue();

		Funcao1 funcao1 = new Funcao1(alfa, maxX);
		pnlFunc1.removeAll(); //limpa o painel
		pnlFunc1.add(funcao1.plotaGrafico()); //adiciona o gráfico ao painel

		Funcao2 funcao2 = new Funcao2(alfa, maxX);
		pnlFunc2.removeAll(); //limpa o painel
		pnlFunc2.add(funcao2.plotaGrafico()); //adiciona o gráfico ao painel

		/** por exemplo, chama um método func1(alfa) que recalcula a função e retorna o JFreeChart pronto
		 * aí é só colocar o gráfico no respectivo painel
		 * */
	}

	private void createUIComponents() {
		//instancia o painel
		pnlFunc1 = new JPanel();
		pnlFunc2 = new JPanel();
	}
}
