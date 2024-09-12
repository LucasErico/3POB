package lista2;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Entre com o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Entre com seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual-anoNascimento;

        System.out.println("Sua idade é: "+idade);

        if(idade<16)
        {
            System.out.println("Não pode votar!");
        }
        else
        {
            System.out.println("É eleitor!"); 
        }

        scanner.close();
    }
    
}
