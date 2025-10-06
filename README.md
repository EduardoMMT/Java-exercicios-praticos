# Exercícios Base de Java

Este repositório contém uma coleção de programas Java simples, desenvolvidos como exercícios fundamentais para praticar a **entrada de dados**, **operações matemáticas** e **lógicas**, e a **formatação de saída**. Eles são ideais para quem está começando a aprender a linguagem Java.

---

## 💻 Programas de Cálculo e Conversão

Estes programas focam em receber dados do usuário e aplicar fórmulas matemáticas simples para resolver problemas comuns.

### `MediaAritmetica.java`

* **Descrição**: O programa calcula a média aritmética de três notas fornecidas pelo usuário.
* **Foco**: Leitura de **números decimais (`double`)** usando `Scanner` e cálculo de média.
* **Adicional**: O programa inclui uma estrutura condicional para verificar e informar se o aluno está **aprovado ou reprovado** (média $\geq 6$).

### `EstoqueMedio.java`

* **Descrição**: Determina o estoque médio ideal para um item, com base nas quantidades mínima e máxima estipuladas pelo usuário.
* **Fórmula**: $EstoqueMédio = (QuantidadeMínima + QuantidadeMáxima) / 2$.
* **Foco**: Entrada de **números inteiros (`int`)** e aplicação de operadores aritméticos.

### `PrecoComDesconto.java`

* **Descrição**: Calcula o preço final de um produto e o valor exato que o cliente economizou após a aplicação de um percentual de desconto.
* **Foco**: Cálculo de percentual e o uso de **`printf`** para formatar a saída com precisão de duas casas decimais.

### `ConversorDolarReal.java`

* **Descrição**: Realiza a conversão de um valor em Dólar para Reais, solicitando tanto o valor a ser convertido quanto a cotação atual.
* **Foco**: Leitura de múltiplos valores `double` e operadores de multiplicação para a conversão.

---

## ⏱️ Programas Lógicos e de Utilidade

Estes exercícios exploram estruturas de controle de fluxo e diferentes métodos de interação com o usuário.

### `DiasDeIdade.java`

* **Descrição**: Converte a idade fornecida em anos para o número equivalente de dias (assumindo 365 dias por ano).
* **Foco**: Operadores aritméticos e uso de uma **estrutura condicional (`if/else`)** para fornecer uma mensagem de feedback com base na idade.

### `RelacionamentosDeOrdem.java`

* **Descrição**: Demonstra o uso dos **Operadores Relacionais** em Java. O programa lê dois números e imprime o resultado booleano (`true` ou `false`) para todas as comparações possíveis (igual, não igual, maior, menor, etc.).
* **Foco**: Operadores Relacionais (`==`, `!=`, `>`, `<`, `>=`, `<=`).

### `Tabuada.java`

* **Descrição**: Recebe um número inteiro e imprime a sua tabuada completa, dos fatores de 1 a 10.
* **Foco**: Demonstra o uso de operações repetidas.

### `SaudacoesConsole.java`

* **Descrição**: Cria uma saudação personalizada, com o objetivo principal de demonstrar o uso da classe **`java.io.Console`** para leitura de entrada, como alternativa ao `Scanner`.
* **Foco**: Uso da biblioteca `java.io` e exploração de diferentes métodos de entrada de dados, incentivando a consulta da documentação oficial.

## Como usar
1. Abre o terminal na pasta dos arquivos.
2. Compila com:
   javac NomeDoArquivo.java
3. Roda com:
   java NomeDoArquivo
4. Pronto.

Precisa ter Java instalado.
