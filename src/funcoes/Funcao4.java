package funcoes;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Funcao4 {
    private JFreeChart chart;

    public Funcao4(double valorInic, int maxX) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series = new XYSeries(valorInic);
        //gera os valores de y
        double valor = valorInic;
        for (int x = 1; x < maxX; x++) {
            double y = Math.sin(valor);
            valor = y;
            series.add(x, y);
        }
        dataset.addSeries(series);

        //cria o gráfico
        chart = ChartFactory.createScatterPlot("Seno de " + valorInic, "x", "f(x)", dataset);
    }

    public ChartPanel plotaGrafico() {
        return new ChartPanel(this.chart);
    }
}
