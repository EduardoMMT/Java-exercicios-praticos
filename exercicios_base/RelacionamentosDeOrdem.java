package exercicios_base;
import java.util.Scanner;
/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre
 * dois números;
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 * 
 * 1. Ler 2 números;
 * 2. Imprimir os relacionamentos de ordem existentes entre eles.
 * 
 * Exemplo: Dados os números 2 e 3:
 * 2 = 3 ? false, 2 != 3 ? true, ..., 2 <= 3 ? true.
 */

public class RelacionamentosDeOrdem {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número para verificar a ordem entre ele e o próximo: ");
    int numero1 = scanner.nextInt();
    System.out.println("Digite o próximo número: ");
    int numero2 = scanner.nextInt();

    System.out.println(numero1 + " = " + numero2 + " ? " + (numero1 == numero2));
    System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
    System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
    System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
    System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
    System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));

    scanner.close();
}  
}
