package exercicios_base;
import java.util.Scanner;
/*
 * Exercicio 1
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler as 3 notas
 * 2. Calcular a média
 * 3. Imprimir a média
 * 
 * Formula da média aritmética: 
 *   (nota1 + nota2 + nota3) / 3
 */

public class MediaAritmetica {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota:");
    double nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota:");
    double nota3 = scanner.nextDouble();

    scanner.close();

    double mediaNotas = (nota1 + nota2 + nota3) / 3;
    System.out.printf("A média aritmética é: %.2f ", mediaNotas);
    

    if (mediaNotas >= 6) {
      System.out.println("Aluno aprovado!");
    } 
    else {
      System.out.println("Aluno reprovado!");
    }
  }
}