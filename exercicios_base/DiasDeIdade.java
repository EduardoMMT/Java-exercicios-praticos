package exercicios_base;
import java.util.Scanner;
/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias.
 * 
 * Ex: 1 ano => 365 dias de idade 
 */

public class DiasDeIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade: ");

    int idadeAnos = scanner.nextInt();
    scanner.close();

    int idadeDias = idadeAnos * 365;
    System.out.printf("Você tem %d dias de idade!", idadeDias );

    if (idadeAnos > 25) {
      System.out.println("Tá ficando velho hein!");
      }
    else {
        System.out.println("Você ainda é jovem!");
      }
  }
}
