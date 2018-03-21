import javax.swing.*;

public class Interface extends JFrame {
	private JButton recalcularButton;
	private JPanel pnlFunc1;
	private JSpinner spnValor;
	private JPanel pnlFunc2;
	private JPanel content;

	private Interface() {
		setContentPane(content);
		pack(); //reorganiza a janela
		setLocationRelativeTo(null); //centraliza
		setVisible(true); //exibe
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //finaliza o processo ao fechar a janela

		//noinspection DanglingJavadoc
		recalcularButton.addActionListener(e -> {
			int alfa = (int) spnValor.getValue();
			//TODO atualiza os gráficos

			/** por exemplo, chama um método func1(alfa) que recalcula a função e retorna o JFreeChart pronto
			 * aí é só colocar o gráfico no respectivo painel
			 * */
		});
	}

	public static void main(String[] args) {
		new Interface();
	}

	private void createUIComponents() {
		// TODO adicionar os comandos para inserir o gráficos em cada painel (não esquece de instanciar o JPanel)
	}
}
