package exercicios_base;
import java.util.Scanner;
/*
 * Faça um programa que converta um valor em dólar pra reais.
 * 
 * ex: Dólares= 100, Cotação = 4,92 => O valor em reais é R$492,00.
 */

public class ConversorDolarReal {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner (System.in);

    System.out.println("Qual valor em Dólares você deseja converter? ");
    double dolar = scanner.nextDouble();
    //double cotacao = 5.34;
    System.out.println("Qual a cotação atual? ");
    double cotacaoDolar = scanner.nextDouble();

    double reaisConvert = cotacaoDolar * dolar;
    System.out.printf("A cotação atual do dolar hoje é %.2f, então, %.2f doláres são R$: " + reaisConvert ,cotacaoDolar, dolar);

    scanner.close();
  }
}
