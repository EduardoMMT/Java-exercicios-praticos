package exercicios_base;

/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2 
 * 
 * ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades. 
 */

import java.util.Scanner;

public class EstoqueMedio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade mínima de estoque do item: ");
    int quantidadeMinima = scanner.nextInt();
    System.out.println("Digite a quantidade máxima de estoque do item: ");
    int quantidadeMaxima = scanner.nextInt();

    scanner.close();

    int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
    System.out.printf("A quantidade máxima do estoque é %d, a quantidade mínima é %d. Então a quantidade média do estoque é: %d",quantidadeMaxima,quantidadeMinima,estoqueMedio);
  }
}
