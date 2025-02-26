** Algoritmo de Colônia de Formigas em Java **

Este projeto implementa o algoritmo de colônia de formigas (ACO - Ant Colony Optimization) para encontrar caminhos otimizados em um grafo.

* O que é o algoritmo colônia de formigas?

É um algoritimo heurístico baseado em probabilidade, criado para solução de problemas computacionais que envolvem procura de caminhos em grafos.
Este algoritmo foi inspirado na observação do comportamento das formigas ao saírem de sua colônia para encontrar comida.

No mundo real, as formigas andam sem rumo (pelo menos inicialmente) até que, encontrada comida, elas retornam à colônia deixando um rastro de  feromônio. 
Se outras formigas encontram um desses rastros, elas tendem a não seguir mais caminhos aleatórios. Em vez disso, seguem a trilha encontrada, retornando e inclusive enfatizando se acharam alimento. 
Com o transcorrer do tempo, entretanto, as trilhas de feromônio começam a evaporar, reduzindo, assim, sua força atrativa. Quanto mais formigas passarem por um caminho predeterminado, mais tempo será necessário para o feromônio da trilha evaporar.  
Analogamente, elas marcharão mais rapidamente por sobre um caminho curto, o que implica aumento da densidade de feromônio depositado antes que ele comece a evaporar. 
Todavia, quando uma formiga encontra um bom (curto) caminho entre a colônia e a fonte de alimento, outras formigas tenderão a seguir este caminho, gerando assim feedback positivo, o que eventualmente torna um determinado caminho mais interessante. 
A idéia do algoritmo da colônia de formigas é imitar este comportamento através de formigas virtuais que caminham por um grafo que por sua vez representa o problema a ser resolvido.


* Funcionalidades

✔️ Simulação de um grupo de formigas percorrendo um grafo
✔️ Atualização de feromônio ao longo das iterações
✔️ Exibição do melhor caminho encontrado

* Tecnologias utilizadas

- Java

- Programação Orientada a Objetos (POO)

* Como executar o projeto

  1. Abra o Git Bash
  2. Clone o repositório digitando:

  git clone https://github.com/ClaraSantosVasconcelos/AlgoritmoColoniaDeFormigas.git

  3. Pressione ENTER para criar seu clone local
  4. Abra o terminal (no Linux) ou o Prompt de Comando (Windows) e execute os
  seguintes comandos:

  javac AlgoritmoColoniaDeFormigas.java
  java AlgoritmoColoniaDeFormigas

* Exemplo de saída, mostrando os caminhos percorrridos, o custo de cada caminho e , por fim, o melhor caminho encontrado e seu custo:
  
  Caminho percorrido: [0, 1, 2, 4, 3]
  Custo do caminho: 80.0
  Caminho percorrido: [1, 0, 2, 3, 4]
  Custo do caminho: 70.0
  Caminho percorrido: [2, 0, 1, 3, 4]
  Custo do caminho: 55.0
  Caminho percorrido: [3, 4, 2, 1, 0]
  Custo do caminho: 80.0
  Caminho percorrido: [4, 3, 2, 1, 0]
  Custo do caminho: 75.0
  
  Melhor caminho encontrado: [2, 0, 1, 3, 4]
  Custo do melhor caminho: 55.0

* Explicando o código:

  O projeto é composto por quatro classes: Grafo.java, Formiga.java, ColoniaDeFormigas.java e AlgoritmoColoniaDeFormigas.java, explicarei como cada classe funciona:
    1. Classe Grafo
    -Representa o grafo onde as formigas se movimentam.
    -Armazena as conexões entre os nós (arestas) e os pesos dessas conexões (distâncias).
    -Também mantém a trilha de feromônio, que influencia a escolha das formigas.

  Principais métodos:
    -adicionarAresta(int origem, int destino, double peso): adiciona uma conexão entre dois nós com um peso associado.
    -obterPeso(int origem, int destino): retorna a distância entre dois nós.
    -obterFeromonio(int origem, int destino): retorna o nível de feromônio em um caminho.
    -atualizarFeromonio(int origem, int destino, double valor): atualiza o nível de feromônio na aresta entre dois nós.

  2. Classe Formiga
    -Representa uma formiga no algoritmo.
    -Cada formiga explora o grafo buscando um caminho curto e eficiente.
    -Ela escolhe o próximo nó com base no feromônio e na distância.

  Principais atributos:
    -noAtual: indica onde a formiga está no momento.
    -caminhoPercorrido: lista dos nós visitados pela formiga.
    -visitados: mantém um conjunto de nós já visitados para evitar ciclos.
    -custoCaminho: registra o custo total do caminho percorrido.
  
  Principais métodos:
    -caminhar(): faz a formiga percorrer o grafo até visitar todos os nós.
    -escolherProximoNo(): decide para onde a formiga vai, baseado em uma regra probabilística que usa feromônio e distância.

  3. Classe ColoniaDeFormigas
    -Coordena um grupo de formigas e gerencia a atualização dos feromônios.
    -Controla a evaporação de feromônio e reforça os melhores caminhos.

  Principais atributos:
    -formigas: lista contendo todas as formigas da simulação.
    -EVAPORACAO_FEROMONIO: taxa de evaporação do feromônio (evita acúmulo excessivo).
    -INTENSIDADE_FEROMONIO: quantidade de feromônio depositada após uma iteração.

  Principais métodos:
    -executar(int iteracoes): executa o algoritmo por um número definido de iterações.
    -atualizarFeromonios(): ajusta os níveis de feromônio com base nas rotas percorridas.

  4. Classe AlgoritmoColoniaDeFormigas (Main)
    -Classe principal que configura o grafo e inicia a simulação.
    -Cria um grafo de teste, adiciona conexões e executa o algoritmo.

  Principais etapas:
    -Cria um grafo de 5 nós e adiciona conexões (arestas).
    -Instancia uma colônia de formigas com 5 formigas.
    -Executa o algoritmo por 100 iterações.

* Contato
  - E-mail: mclarasv17@gmail.com
  - Linkedin: www.linkedin.com/in/clara-santos-6b97432b7






  
