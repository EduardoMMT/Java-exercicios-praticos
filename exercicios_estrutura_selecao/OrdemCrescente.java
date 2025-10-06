package exercicios_estrutura_selecao;

import java.util.Scanner;

/*
 * Leia 3 números e imprima-os em ordem crescente.
 */
public class OrdemCrescente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 3 número para verificar a ordem: ");
    int numero1 = scanner.nextInt();
    int numero2 = scanner.nextInt();
    int numero3 = scanner.nextInt();

    if (numero1 > numero2 && numero2 > numero3) {
        System.out.println(numero3 + ", " + numero2 + ", "+ numero1);      
    } 
    else if (numero1 > numero2 && numero2 < numero3) {
      System.out.println(numero2 + ", " + numero3 + ", "+ numero1);
    } 
    else if (numero1 < numero2 && numero2 > numero3 && numero3 > numero1) {
      System.out.println(numero1 + ", " + numero3 + ", "+ numero2);
    } 
    else if (numero1 < numero2 && numero2 > numero3 && numero3 < numero1) {
      System.out.println(numero3 + ", " + numero1 + ", "+ numero2);
    } 
    else if (numero1 < numero2 && numero2 < numero3) {
      System.out.println(numero1 + ", " + numero2 + ", "+ numero3);
    } 
    else if (numero1 > numero2 && numero3 > numero1) {
      System.out.println(numero2 + ", " + numero1 + ", "+ numero3);
    } 
    else {
      System.out.println("Tem números repetidos");
    }
    scanner.close();
  } 
}

/* Código da professora:

     if (numero1 < numero2 && numero1 < numero3) {
      System.out.println(numero1);

      if (numero2 < numero3) {
        System.out.println(numero2);
        System.out.println(numero3);
      } else {
        System.out.println(numero3);
        System.out.println(numero2);
      }

    } else if (numero2 < numero1 && numero2 < numero3) {
      System.out.println(numero2);

      if (numero1 < numero3) {
        System.out.println(numero1);
        System.out.println(numero3);
      } else {
        System.out.println(numero3);
        System.out.println(numero1);
      }
    } else {
      System.out.println(numero3); 

      if (numero1 < numero2) {
        System.out.println(numero1);
        System.out.println(numero2);
      } else {
        System.out.println(numero2);
        System.out.println(numero1);
      }
    }
    scanner.close();
  }
}
*/