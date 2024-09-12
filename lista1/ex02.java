package lista1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ex02 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.print("Entre com uma temperatura em farenheit: ");
        double farenheit = scanner.nextDouble();

        double celsius = (double)5/9 * (farenheit - 32);

        System.out.println("Temperatura em Celsius: "+decimal.format(celsius)+"°");


        scanner.close();
    }
}
