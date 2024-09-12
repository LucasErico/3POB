package lista2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex03 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.print("Entre com seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1+nota2)/2;
        System.out.println(nome+", sua média é: "+decimal.format(media));

        if(media<7)
        {
            System.out.println(nome+", você está reprovado!");
        }
        else
        {
            System.out.println(nome+", você está reprovado!");
        }

        scanner.close();
    }
}
