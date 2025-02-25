package algoritmo_colonia_formigas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Formiga {
	private int noAtual;
    private List<Integer> caminhoPercorrido;
    private Set<Integer> visitados;
    private double custoCaminho;
    private Grafo grafo;
    private static final double INFLUENCIA_FEROMONIO = 1.0;
    private static final double INFLUENCIA_DISTANCIA = 2.0;

    public Formiga(int noInicial, Grafo grafo) {
        this.noAtual = noInicial;
        this.caminhoPercorrido = new ArrayList<>();
        this.visitados = new HashSet<>();
        this.grafo = grafo;
        this.custoCaminho = 0.0;
        caminhoPercorrido.add(noAtual);
        visitados.add(noAtual);
    }

    public void caminhar() {
        while (caminhoPercorrido.size() < grafo.getQuantidadeNos()) {
            int proximoNo = escolherProximoNo();
            if (proximoNo == -1) break;
            custoCaminho += grafo.obterPeso(noAtual, proximoNo);
            noAtual = proximoNo;
            caminhoPercorrido.add(noAtual);
            visitados.add(noAtual);
        }
    }

    private int escolherProximoNo() {
        List<Integer> vizinhos = new ArrayList<>();
        List<Double> probabilidades = new ArrayList<>();
        double somaProbabilidades = 0.0;
        
        for (int i = 0; i < grafo.getQuantidadeNos(); i++) {
            if (!visitados.contains(i) && grafo.obterPeso(noAtual, i) > 0) {
                double feromonio = Math.pow(grafo.obterFeromonio(noAtual, i), INFLUENCIA_FEROMONIO);
                double distancia = Math.pow(1.0 / grafo.obterPeso(noAtual, i), INFLUENCIA_DISTANCIA);
                double probabilidade = feromonio * distancia;
                vizinhos.add(i);
                probabilidades.add(probabilidade);
                somaProbabilidades += probabilidade;
            }
        }
        
        if (vizinhos.isEmpty()) return -1;
        
        double escolha = Math.random() * somaProbabilidades;
        double acumulado = 0.0;
        for (int i = 0; i < vizinhos.size(); i++) {
            acumulado += probabilidades.get(i);
            if (acumulado >= escolha) {
                return vizinhos.get(i);
            }
        }
        return vizinhos.get(vizinhos.size() - 1);
    }

    public List<Integer> getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public double getCustoCaminho() {
        return custoCaminho;
    }
}
