# Exercícios Base de Java

Este repositório contém uma coleção de programas Java simples, criados como exercícios básicos para praticar a leitura de entrada do usuário, operações matemáticas e lógicas, e formatação de saída. Eles são ideais para quem está começando a aprender sobre **estrutura de programas**, **entrada e saída de dados** e **operadores** em Java.

---

## 📁 Descrição dos Programas

| Arquivo | Descrição Detalhada | Conceitos-Chave |
| :--- | :--- | :--- |
| **`DiasDeIdade.java`** | O programa solicita que o usuário digite sua idade em anos e, em seguida, calcula e imprime essa idade convertida em dias (assumindo 365 dias por ano). Ele também utiliza uma estrutura condicional (`if/else`) simples para dar uma mensagem personalizada baseada na idade informada. | **`Scanner`**, **Entrada de `int`**, Operadores Aritméticos, **`if/else`** (Estrutura Condicional). |
| **`EstoqueMedio.java`** | Este programa é usado para calcular o estoque médio de um produto, que é um cálculo comum em gestão de inventário. Ele solicita a quantidade mínima e a quantidade máxima de estoque e aplica a fórmula: $EstoqueMédio = (Mínimo + Máximo) / 2$. | **`Scanner`**, **Entrada de `int`**, Operadores Aritméticos. |
| **`PrecoComDesconto.java`** | O programa calcula o preço final de um produto após a aplicação de um desconto percentual. O usuário insere o valor original do produto e a porcentagem de desconto. O resultado mostra o preço final com desconto e o **valor exato economizado** em reais, utilizando formatação de saída (`printf`) para garantir a precisão de duas casas decimais. | **`Scanner`**, **Entrada de `double`**, Cálculo de Percentual, **`printf`** (Formatação de Saída). |
| **`RelacionamentosDeOrdem.java`** | Este exercício tem como foco os **Operadores Relacionais** em Java. Ele lê dois números inteiros e, para cada par, imprime o resultado (verdadeiro ou falso) de todas as comparações de ordem: igual (`==`), não igual (`!=`), maior (`>`), menor (`<`), maior ou igual (`>=`), e menor ou igual (`<=`). | **`Scanner`**, **Entrada de `int`**, **Operadores Relacionais** (`==`, `!=`, `>`, `<`, `>=`, `<=`). |
| **`SaudacoesConsole.java`** | Um exercício que demonstra uma alternativa ao `Scanner` para leitura de entrada: a classe `java.io.Console`. O programa pede o nome do usuário e imprime uma saudação. É um ótimo exemplo para entender como buscar e utilizar classes menos comuns da documentação oficial do Java. | **`Console`**, **Leitura de `String`**. (Nota: O `Console` pode ter limitações de uso em alguns IDEs ou ambientes.) |

## Como usar
1. Abre o terminal na pasta dos arquivos.
2. Compila com:
   javac NomeDoArquivo.java
3. Roda com:
   java NomeDoArquivo
4. Pronto.

Precisa ter Java instalado, obviamente.
