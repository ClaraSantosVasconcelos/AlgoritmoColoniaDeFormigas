package algoritmo_colonia_formigas;

import java.util.ArrayList;
import java.util.List;

public class ColoniaDeFormigas {
	private Grafo grafo;
    List<Formiga> formigas;
    private static final double EVAPORACAO_FEROMONIO = 0.5;
    private static final double INTENSIDADE_FEROMONIO = 1.0;

    public ColoniaDeFormigas(Grafo grafo, int quantidadeFormigas) {
        this.grafo = grafo;
        this.formigas = new ArrayList<>();
        for (int i = 0; i < quantidadeFormigas; i++) {
            formigas.add(new Formiga(i % grafo.getQuantidadeNos(), grafo));
        }
    }

    public void executar(int iteracoes) {
        for (int i = 0; i < iteracoes; i++) {
            for (Formiga formiga : formigas) {
                formiga.caminhar();
            }
            atualizarFeromonios();
        }
    }

    private void atualizarFeromonios() {
        for (int i = 0; i < grafo.getQuantidadeNos(); i++) {
            for (int j = 0; j < grafo.getQuantidadeNos(); j++) {
                grafo.atualizarFeromonio(i, j, grafo.obterFeromonio(i, j) * EVAPORACAO_FEROMONIO);
            }
        }
        
        for (Formiga formiga : formigas) {
            List<Integer> caminho = formiga.getCaminhoPercorrido();
            double depositoFeromonio = INTENSIDADE_FEROMONIO / formiga.getCustoCaminho();
            for (int i = 0; i < caminho.size() - 1; i++) {
                int origem = caminho.get(i);
                int destino = caminho.get(i + 1);
                grafo.atualizarFeromonio(origem, destino, grafo.obterFeromonio(origem, destino) + depositoFeromonio);
            }
        }
    }
    public Formiga obterMelhorFormiga() {
        Formiga melhor = formigas.get(0);
        for (Formiga formiga : formigas) {
            if (formiga.getCustoCaminho() < melhor.getCustoCaminho()) {
                melhor = formiga;
            }
        }
        return melhor;
    }

}
