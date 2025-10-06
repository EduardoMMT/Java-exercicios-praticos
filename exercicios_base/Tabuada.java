package exercicios_base;
import java.util.Scanner;
/*
 * Imprimir a tabuada de um número.
 * 
 * 1. Ler um número
 * 2. Imprimir a tabuada.
 * 
 * 1 a 10 : 1*1 = 1, 1*2 = 2, ..., 1*10 = 10 
 */

public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite um número: ");
    int numero = scanner.nextInt();    

    System.out.println(numero + " x 1 = " + (numero));
    System.out.println(numero + " x 2 = " + (numero * 2));
    System.out.println(numero + " x 3 = " + (numero * 3));
    System.out.println(numero + " x 4 = " + (numero * 4));
    System.out.println(numero + " x 5 = " + (numero * 5));
    System.out.println(numero + " x 6 = " + (numero * 6));
    System.out.println(numero + " x 7 = " + (numero * 7));
    System.out.println(numero + " x 8 = " + (numero * 8));
    System.out.println(numero + " x 9 = " + (numero * 9));
    System.out.println(numero + " x 10 = " + (numero * 10));
    
    scanner.close();

    /*System.out.println("digite um número: ");
    int numero = scanner.nextInt();
    int contador = 1;
    while (contador <= 10) {
    System.out.println(numero + " x " + contador + " = " + (numero * contador));
    contador++;
    
    Essa forma é melhor que a de cima, porque evita repetição de código.
    Basicamente, while = enquanto, então, enquanto o contador for menor ou igual a 10, 
    printe o numero vezes o contador, e depois incremente mais 1 no contador.
    */
  }
}
