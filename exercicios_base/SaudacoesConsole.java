package exercicios_base;
import java.io.Console;
/*
 * Crie um programa que leia um nome e imprima uma saudação utilizando o
 * Console ao invés do Scanner.
 * 
 * Javadoc: https:/docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/Console.html
 * Nesse exercício, a ideia é buscar na documentação como se utiliza a casse Console. 
 * Visando o aprendizado do uso da documentação, como é comum no dia a dia. 
 */


public class SaudacoesConsole {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Digite seu nome: ");
    String nome = console.readLine();
    System.out.println("Olá, " + nome);
  
    // O console.readLine(); pode imprimir dados sem a necessidade do sysout anterior.
    // String nome = console.readLine ("Digite seu nome: ");
  }
}
