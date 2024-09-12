package lista2;
import java.util.Scanner;

public class ex01 {

   public static void main(String[] args) {

       // Criação do scanner para entrada de dados
       Scanner scanner = new Scanner(System.in);

       // Solicita o nome da pessoa
       System.out.print("Digite o seu nome: ");
       String nome = scanner.nextLine();

       // Solicita a idade da pessoa
       System.out.print("Digite a sua idade: ");
       int idade = scanner.nextInt();

       // Verifica se a idade é menor que 18 e exibe a mensagem
       if (idade < 18) {
           System.out.println(nome + ", você é menor.");
       } else {
           System.out.println(nome + ", você é maior de idade.");
       }
       // Fecha o scanner
       scanner.close();
   }
}