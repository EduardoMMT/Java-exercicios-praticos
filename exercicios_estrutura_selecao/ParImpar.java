package exercicios_estrutura_selecao;

import java.util.Scanner;
/*
 * Leia um número e imprima se ele é par ou ímpar
 */
public class ParImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número para verificar se é par ou ímpar: ");
    int numero = scanner.nextInt();

    boolean parImpar = numero % 2 == 0;

    if (parImpar) {
      System.out.printf("O número %d é par", numero);
    } else {
        System.out.printf("O número %d é ímpar", numero);
      }
    scanner.close();
  } 
  
}
