/*
 * Crie uma calculadora que dados 2 números e uma operação
 * (adição, subtração, multiplicação ou divisão), retorne o
 * resultado dessa operação entre os dois números.
 * 
 * Ex: 
 *  1 2 * => 1 * 2 = 2
 *  8 2 / => 8 / 2 = 4
 */

package exercicios_estrutura_selecao;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número da operação: ");
    double numero1 = scanner.nextDouble();
    
    
    System.out.println("Digite a operação desejada (*, +, -, /): ");
    String operacao = scanner.next();

    System.out.println("Digite o segundo número da operação:");
    double numero2 = scanner.nextDouble();

    if (operacao.equals("*") ) {
      System.out.printf("%.2f %s %.2f = %.2f",
       numero1, operacao, numero2, numero1 * numero2);
    } else if (operacao.equals("+")) {
      System.out.printf("%.2f %s %.2f = %.2f",
       numero1, operacao, numero2, numero1 + numero2);
    } else if (operacao.equals("-")) {
      System.out.printf("%.2f %s %.2f = %.2f",
       numero1, operacao, numero2, numero1 - numero2);
    } else if (operacao.equals("/")) {
      System.out.printf("%.2f %s %.2f = %.2f",
       numero1, operacao, numero2, numero1 / numero2);
    } else {
      System.out.println("Operação inválida!");
    }
  scanner.close();
  }
}
/* Código da professora:   
 switch(operador) {
      case "+" -> System.out.printf("%d %s %d = %d", 
        numero1, operador, numero2, numero1 + numero2);
      case "-" -> System.out.printf("%d %s %d = %d", 
        numero1, operador, numero2, numero1 - numero2);
      case "*" -> System.out.printf("%d %s %d = %d", 
        numero1, operador, numero2, numero1 * numero2);
      case "/" -> System.out.printf("%d %s %d = %d", 
        numero1, operador, numero2, numero1 / numero2);
      default -> System.out.println("Operador inválido!");
    }
 */
