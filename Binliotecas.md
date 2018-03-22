# Para editar o código
# Bibliotecas do Maven que precisam ser importadas:
- `org.jfree:jcommon:1.0.24`
- `org.jfree:jfreechart:1.5.0`
### Para importar pelo IntelliJ
1. File/Project Structure...
2. Libraries/ + / From Maven...
3. Cola o nome do pacote e dá OK

# Links úteis
Se acharem mais algum, só adicionem aqui!  
[Curso na Caelum](http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/graficos-com-jfreechart/)  
[LineChart](https://www.tutorialspoint.com/jfreechart/jfreechart_xy_chart.htm)  
[Scatter Plot](https://www.boraji.com/jfreechart-scatter-chart-example) (é o que precisamos fazer)

# Inferface
Cada função é exibida dentro de um JTabbedPanel. Tem que criar o gráfico e adicionar ao painel específico.
A minha ideia é criar uma classe para cada função, com um método que recalcula a função, retornando o gráfico pronto 
