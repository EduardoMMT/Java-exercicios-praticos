/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média de 7.0 ou maior para ser aprovado.
 */

package exercicios_estrutura_selecao;

import java.util.Scanner;

public class AprovadoReprovado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite suas três notas: ");
    double nota1 = scanner.nextDouble();
    double nota2 = scanner.nextDouble();
    double nota3 = scanner.nextDouble();

    double mediaAluno = (nota1 + nota2 + nota3) / 3; 
    boolean mediaAprov = mediaAluno >= 7;
    
    if (mediaAprov) {
      System.out.printf("Você foi aprovado! Sua nota foi: %.2f", mediaAluno);
      } else {
      System.out.printf("Você foi reprovado! Sua nota foi: %.2f E você precisava de uma nota maior que 7.",
      mediaAluno);
        }
    scanner.close();
  }
}
