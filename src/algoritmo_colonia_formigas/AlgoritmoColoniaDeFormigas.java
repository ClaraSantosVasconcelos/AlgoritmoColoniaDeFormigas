package algoritmo_colonia_formigas;

public class AlgoritmoColoniaDeFormigas {

	public static void main(String[] args) {
		Grafo grafo = new Grafo(5);
        grafo.adicionarAresta(0, 1, 10);
        grafo.adicionarAresta(0, 2, 20);
        grafo.adicionarAresta(1, 2, 25);
        grafo.adicionarAresta(1, 3, 15);
        grafo.adicionarAresta(2, 3, 30);
        grafo.adicionarAresta(2, 4, 35);
        grafo.adicionarAresta(3, 4, 10);

        ColoniaDeFormigas colonia = new ColoniaDeFormigas(grafo, 5);
        colonia.executar(100);
        
        for (Formiga formiga : colonia.formigas) {
            System.out.println("Caminho percorrido: " + formiga.getCaminhoPercorrido());
            System.out.println("Custo do caminho: " + formiga.getCustoCaminho());
        }
        
        // Encontrando o melhor caminho
        Formiga melhorFormiga = colonia.obterMelhorFormiga();
        System.out.println("\nMelhor caminho encontrado: " + melhorFormiga.getCaminhoPercorrido());
        System.out.println("Custo do melhor caminho: " + melhorFormiga.getCustoCaminho());

	}

}
