package exercicios_estrutura_selecao;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */

public class CategoriaAtleta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("digite sua idade: ");
    int idade = scanner.nextInt();

    if (idade >= 10 && idade <= 12) {
      System.out.println("Você irá participar da categoria Mirim!");
    } else if (idade >= 13 && idade <= 15) {
      System.out.println("Você irá participar da categoria Infantil!");
    } else if (idade >= 16 && idade <= 18) {
      System.out.println("Você irá participar da categoria Juvenil!");
    } else if (idade > 18) {
      System.out.println("Você é maior que a faixa etária do campeonato, não poderá participar");
    } else {
      System.out.println("Você é muito jovem para participar desse campeonato.");
    }
    scanner.close();
    }
  }
/* Código da professora:
 if (idade >= 10 && idade <= 12)
      System.out.println("MIRIM");
    else if (idade >= 13 && idade <= 15)
      System.out.println("INFANTIL");
    else if (idade >= 16 && idade <= 18)
      System.out.println("JUVENIL");
    else
      System.out.println("Idade é inválida!");   
*/