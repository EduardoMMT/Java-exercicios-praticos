package exercicios_base;
import java.util.Scanner;
/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler o preço do produto.
 * 2. Ler o percentual de desconto.
 * 3. Imprimir o preço com desconto e o valor economizado em reais.
 * 
 * Ex: R$100,00 com 10% de desconto = O preço com desconto é R$90,00 
 * e você economizou R$10,00.
 */

public class PrecoComDesconto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o valor do produto: ");
    double precoDoProduto = scanner.nextDouble();
    System.out.println("Digite a porcentagem de desconto: ");
    double desconto = scanner.nextDouble();

    scanner.close();

    double valorEconomizado = (precoDoProduto * desconto) / 100;
    double precoComDesconto = precoDoProduto - valorEconomizado;
    
    System.out.printf("Com desconto de %.2f%%, o valor fica R$: %.2f. ", desconto, precoComDesconto);
    System.out.printf("O desconto foi de R$: %.2f", valorEconomizado);
  }
}
