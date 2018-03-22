package funcoes;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Funcao2 {
	private JFreeChart chart;

	public Funcao2(int valor, int maxX) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries series = new XYSeries(valor);
		//gera os valores de y
		for (int x = 1; x < maxX; x++) {
			double y = valor * x;
			series.add(x, y);
		}
		dataset.addSeries(series);

		//cria o gráfico
		chart = ChartFactory.createScatterPlot(valor + " elevado ao x", "x", "f(x)", dataset);
	}

	public ChartPanel plotaGrafico() {
		return new ChartPanel(this.chart);
	}
}
