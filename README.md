# 🎮 GameHub — Jogo da Forca

Um jogo da forca executado no terminal, desenvolvido em Java como projeto de prática de **Programação Orientada a Objetos (POO)**. Nesta versão, o jogador precisa descobrir o título de um filme sorteado a partir de uma base de dados em CSV.

O projeto também explora uma interface textual feita com ASCII art, animações simples no terminal e a separação do código em classes com responsabilidades diferentes.

## ✨ Funcionalidades

- Sorteio de um filme a partir do arquivo `filmes.csv`.
- Exibição progressiva de uma abertura em ASCII art.
- Representação visual do boneco conforme as tentativas incorretas.
- Exibição das letras já utilizadas.
- Revelação das letras corretas no título.
- Possibilidade de tentar acertar o título completo usando `#`.
- Mensagens e telas diferentes para vitória e derrota.

## 🛠️ Tecnologias e recursos utilizados

- **Java** — linguagem principal do projeto.
- **Programação Orientada a Objetos (POO)** — organização do estado da partida e do boneco em classes.
- **Eclipse IDE** — ambiente utilizado no desenvolvimento.
- **`Scanner`** — leitura das entradas do jogador pelo terminal.
- **`BufferedReader` e `InputStreamReader`** — leitura do arquivo de filmes.
- **`Random`** — seleção aleatória de um filme.
- **`TimeUnit`** — pausas para criar o ritmo das animações e mensagens.
- **CSV** — formato utilizado para armazenar a base de filmes.
- **ASCII art** — construção da identidade visual no terminal.

O projeto utiliza recursos modernos da linguagem, como *text blocks* para facilitar a escrita de arte textual. Recomenda-se utilizar **Java 17 ou superior**.

## 📁 Estrutura do projeto

```text
GameHub/
├── .gitignore
├── .project
├── .classpath
└── src/
    ├── Forca/
    │   ├── Forca.java
    │   └── Boneco.java
    ├── model/
    │   └── Menu.java
    ├── resources/
    │   └── filmes.csv
    └── services/
        ├── FilmeService.java
        ├── LimpaTela.java
        └── MenuService.java
```

### Responsabilidade das classes

| Arquivo | Responsabilidade |
|---|---|
| `Forca.java` | Ponto de entrada do programa e coordenação do fluxo principal da partida: recebe os palpites, atualiza o estado do jogo e identifica vitória ou derrota. |
| `Boneco.java` | Mantém a quantidade de partes restantes e exibe as diferentes etapas do boneco em ASCII art. |
| `Menu.java` | Reúne informações da partida, como o filme sorteado, a palavra parcialmente revelada, as letras utilizadas e o objeto `Boneco`. |
| `FilmeService.java` | Lê o arquivo `filmes.csv` e sorteia um título para a partida. |
| `MenuService.java` | Centraliza funções relacionadas à apresentação do jogo e à lógica auxiliar, como exibir o menu, gerar a palavra oculta e verificar letras, palpites completos e vitória. |
| `LimpaTela.java` | Encapsula a ação de limpar visualmente o terminal. Na implementação atual, isso é feito imprimindo várias linhas em branco. |
| `filmes.csv` | Base de dados utilizada para selecionar os títulos dos filmes. |

## 🧠 POO e organização do código

A organização busca aplicar conceitos fundamentais de Programação Orientada a Objetos:

- **Encapsulamento:** o estado do boneco, como a quantidade de partes restantes, é mantido em um atributo privado e acessado por métodos.
- **Modelagem de estado:** a classe `Menu` reúne os dados necessários para representar uma partida.
- **Separação de responsabilidades:** a leitura dos filmes, a apresentação visual e a coordenação do jogo estão distribuídas entre classes diferentes, em vez de concentrar toda a implementação em um único arquivo.
- **Abstração:** métodos como `roletarFilme()`, `verificarLetra()` e `verificarVitoria()` oferecem operações com um propósito claro, escondendo parte dos detalhes de implementação de quem os utiliza.

A separação ainda pode evoluir. Por exemplo, uma próxima versão pode deixar `MenuService` responsável apenas pela apresentação e mover as regras da partida para uma classe específica de jogo. Isso reduziria o acoplamento e facilitaria a criação de testes automatizados.

## 🧩 Uso consciente de Design Patterns

O objetivo deste projeto não é aplicar Design Patterns apenas para aumentar a quantidade de padrões no código. A prioridade é manter uma solução compreensível, adequada ao tamanho do problema e fácil de evoluir.

A divisão em classes de serviço e modelo ajuda na organização, mas **não significa, por si só, que um Design Pattern formal esteja implementado**. Nesta versão, não há intenção de afirmar a aplicação de padrões GoF específicos sem que exista uma estrutura correspondente no código.

À medida que o projeto crescer, padrões poderão ser considerados quando resolverem uma necessidade concreta. Por exemplo:

- **Strategy:** poderia ser avaliado se o jogo passasse a oferecer diferentes modos de seleção de palavras ou diferentes regras de partida.
- **Factory:** poderia ser útil caso a criação de diferentes tipos de jogo ou de sessões exigisse uma lógica centralizada.
- **MVC:** poderia ser considerado em uma futura versão com interface gráfica ou web, separando modelo, apresentação e controle.

Esses são caminhos possíveis para evolução, não funcionalidades já implementadas. A escolha de um padrão deve simplificar a manutenção e resolver um problema real, em vez de adicionar complexidade desnecessária.

## ▶️ Como executar

### Pelo Eclipse

1. Tenha o **JDK 17 ou superior** instalado.
2. Abra o Eclipse.
3. Importe a pasta do projeto como um projeto Java existente (*Existing Projects into Workspace*).
4. Confira se `src` está configurada como pasta de código-fonte e se `src/resources/filmes.csv` está disponível no classpath.
5. Abra `Forca.java`, dentro do pacote `Forca`.
6. Execute o método `main` usando **Run As → Java Application**.

O jogo é interativo e recebe os palpites pelo console/terminal do Eclipse. Para uma experiência melhor, utilize um terminal que suporte os caracteres Unicode usados na arte textual.

### Controles

- Digite uma letra para tentar descobri-la no título.
- Digite `#` para tentar informar o título completo do filme.

## 📚 Objetivo de aprendizagem

O GameHub é um projeto de prática para consolidar fundamentos de Java, especialmente POO, manipulação de strings, leitura de arquivos, entrada de dados, estruturas de repetição e condicionais, além da organização de um programa em classes com responsabilidades distintas.

O desenvolvimento também serve como oportunidade para avaliar decisões de arquitetura e evoluir gradualmente a qualidade do código, sem introduzir abstrações ou padrões desnecessários para o escopo atual.

## 🚧 Possíveis melhorias futuras

- Tratar entradas inválidas e palpites com mais robustez.
- Normalizar espaços e capitalização na comparação do título completo.
- Separar melhor as regras da partida da camada de apresentação.
- Criar testes unitários para as regras do jogo.
- Melhorar a leitura e validação do CSV, incluindo o tratamento de erros.
- Permitir jogar novamente sem reiniciar a aplicação.
- Melhorar a limpeza do console de acordo com o sistema operacional e o terminal utilizado.

## 👨‍💻 Autor

Desenvolvido por **Diego Augusto Oliveira** como projeto de estudo em Java e Programação Orientada a Objetos.

- GitHub: [@diego-dev-brazil](https://github.com/diego-dev-brazil)

---

*Projeto educacional em evolução.*
