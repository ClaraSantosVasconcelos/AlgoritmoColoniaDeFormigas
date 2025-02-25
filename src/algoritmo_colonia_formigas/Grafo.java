package algoritmo_colonia_formigas;

public class Grafo {
	private int quantidadeNos;
    private double[][] pesos;
    private double[][] feromonios;
    private static final double FEROMONIO_INICIAL = 1.0;

    public Grafo(int quantidadeNos) {
        this.quantidadeNos = quantidadeNos;
        this.pesos = new double[quantidadeNos][quantidadeNos];
        this.feromonios = new double[quantidadeNos][quantidadeNos];
        
        for (int i = 0; i < quantidadeNos; i++) {
            for (int j = 0; j < quantidadeNos; j++) {
                feromonios[i][j] = FEROMONIO_INICIAL;
            }
        }
    }

    public void adicionarAresta(int origem, int destino, double peso) {
        pesos[origem][destino] = peso;
        pesos[destino][origem] = peso;
    }

    public double obterPeso(int origem, int destino) {
        return pesos[origem][destino];
    }

    public double obterFeromonio(int origem, int destino) {
        return feromonios[origem][destino];
    }

    public void atualizarFeromonio(int origem, int destino, double valor) {
        feromonios[origem][destino] = valor;
        feromonios[destino][origem] = valor;
    }

    public int getQuantidadeNos() {
        return quantidadeNos;
    }
}
