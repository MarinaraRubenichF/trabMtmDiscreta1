import funcoes.Funcao1;
import funcoes.Funcao2;
import funcoes.Funcao3;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Interface extends JFrame {
	private JSpinner spnValor;
	private JSpinner spnMaxX;
	private JPanel pnlFunc1;
	private JPanel pnlFunc2;
	private JPanel pnlFunc3;
	private JPanel content;
	private JTabbedPane pnlFunc4;

	private Interface() {
		setContentPane(content);
		setExtendedState(MAXIMIZED_BOTH); //maximiza a janela
		setLocationRelativeTo(null); //centraliza
		setVisible(true); //exibe
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //finaliza o processo ao fechar a janela

		spnValor.addChangeListener(e -> recalcular());
		spnMaxX.addChangeListener(e -> recalcular());
		spnValor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				recalcular();
			}
		});
		spnMaxX.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				recalcular();
			}
		});
	}

	public static void main(String[] args) {
		new Interface();

	}

	@SuppressWarnings("DanglingJavadoc")
	private void recalcular() {
		//atualiza os gráficos
		double alfa = (double) spnValor.getValue();
		int maxX = (int) spnMaxX.getValue();

		Funcao1 funcao1 = new Funcao1(alfa, maxX);
		pnlFunc1.removeAll(); //limpa o painel
		pnlFunc1.add(funcao1.plotaGrafico()); //adiciona o gráfico ao painel

		Funcao2 funcao2 = new Funcao2(alfa, maxX);
		pnlFunc2.removeAll();
		pnlFunc2.add(funcao2.plotaGrafico());

		Funcao3 funcao3 = new Funcao3(alfa, maxX);
		pnlFunc3.removeAll();
		pnlFunc3.add(funcao3.plotaGrafico());

		/** por exemplo, chama um método func1(alfa) que recalcula a função e retorna o JFreeChart pronto
		 * aí é só colocar o gráfico no respectivo painel
		 * */
	}

	private void createUIComponents() {
		//cria os apinners
		spnValor = new JSpinner(new SpinnerNumberModel(1, -999999999, 999999999, 0.1));
		spnMaxX = new JSpinner(new SpinnerNumberModel(10, 1, 99999, 1));

		//instancia o painel
		pnlFunc1 = new JPanel();
		pnlFunc2 = new JPanel();
		pnlFunc3 = new JPanel();
	}
}
