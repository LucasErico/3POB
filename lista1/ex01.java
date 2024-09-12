package lista1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ex01 {

   public static void main(String[] args) {

       // Criação do scanner para entrada de dados
       Scanner scanner = new Scanner(System.in);
       DecimalFormat decimal = new DecimalFormat("0.00");

       System.out.print("Nome do primeiro funcionário: ");
       String nome1 = scanner.nextLine();

       System.out.print("Salário do primeiro funcionário: ");
       double salario1 = scanner.nextDouble();

       System.out.print("Nome do segundo funcionário: ");
       String nome2 = scanner.nextLine();
       
       System.out.print("Salário do segundo funcionário: ");
       double salario2 = scanner.nextDouble();

       double desconto = salario1*0.05;
       double acrescimo = salario2*0.09;

       salario1 = salario1 - desconto;
       salario2 = salario2 + acrescimo;
       
       System.out.println(nome1+" foi descontado em R$"+decimal.format(desconto));
       System.out.println(salario1+" sálario final: R$"+decimal.format(salario1));


       System.out.println(nome2+" foi acrescido em R$"+decimal.format(acrescimo));
       System.out.println(salario2+" sálario final: R$"+decimal.format(salario2));
      
       // Fecha o scanner
       scanner.close();
   }
}