package lista2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex04 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.print("Entre com seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Entre com o sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Entre com o salário bruto: ");
        float salarioBruto = scanner.nextFloat();

        float desconto;

        if(sexo.equals("Masculino"))
        {
            desconto = salarioBruto*(float)0.05;
            
            
        }
        else
        {
            desconto = salarioBruto*(float)0.03;
        }

        float salarioLiquido = salarioBruto - desconto;

        System.out.println(nome);
        System.out.println("Desconto: "+decimal.format(desconto));
        System.out.println("Desconto: "+decimal.format(salarioLiquido));


        scanner.close();
    }
}
