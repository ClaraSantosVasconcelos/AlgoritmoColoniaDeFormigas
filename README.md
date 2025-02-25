🐜 Algoritmo de Colônia de Formigas em Java

Este projeto implementa o algoritmo de colônia de formigas (ACO - Ant Colony Optimization) para encontrar caminhos otimizados em um grafo.

🐜 O que é o algoritmo colônia de formigas?

É um algoritimo heurístico baseado em probabilidade, criado para solução de problemas computacionais que envolvem procura de caminhos em grafos.
Este algoritmo foi inspirado na observação do comportamento das formigas ao saírem de sua colônia para encontrar comida.

No mundo real, as formigas andam sem rumo (pelo menos inicialmente) atéque, encontrada comida, elas retornam à colônia deixando um rastrode  feromônio. 
Se outras formigas encontram um desses rastros, elas tendem a não seguir mais caminhos aleatórios. Em vez disso, seguem a trilhaencontrada, retornando e inclusive enfatizando se acharam alimento. 
Com o transcorrer do tempo, entretanto, as trilhas de feromônio começam a evaporar, reduzindo, assim, sua força atrativa. Quanto mais formigas passarem por um caminho predeterminado, mais tempo será necessário para o feromônio da trilha evaporar.  
Analogamente, elas marcharão mais rapidamente por sobre um caminho curto, o que implica aumento da densidade de feromônio depositado antes que ele comece a evaporar. 
Todavia, quando uma formiga encontra um bom (curto) caminho entre a colônia e a fonte de alimento, outras formigas tenderão a seguir este caminho, gerando assim feedback positivo, o que eventualmente torna um determinado caminho mais interessante. 
A idéia do algoritmo da colônia de formigas é imitar este comportamento através de formigas virtuais que caminham por um grafo que por sua vez representa o problema a ser resolvido.


📌 Funcionalidades

✔️ Simulação de um grupo de formigas percorrendo um grafo
✔️ Atualização de feromônio ao longo das iterações
✔️ Exibição do melhor caminho encontrado

🚀 Tecnologias utilizadas

- Java

- Programação Orientada a Objetos (POO)

🛠 Como executar o projeto

  1. Abra o Git Bash
  2. Clone o repositório digitando:

  git clone https://github.com/ClaraSantosVasconcelos/AlgoritmoColoniaDeFormigas.git

  3. Pressione ENTER para criar seu clone local
  4. Abra o terminal (no Linux) ou o Prompt de Comando (Windows) e execute os
  seguintes comandos:

  javac AlgoritmoColoniaDeFormigas.java
  java AlgoritmoColoniaDeFormigas

🔎 Exemplo de saída, mostrando os caminhos percorrridos, o custo de cada caminho e , por fim, o melhor caminho encontrado e seu custo:
  
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





  
