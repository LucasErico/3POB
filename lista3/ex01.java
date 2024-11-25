package lista3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        double somatorio = 0.0;
        int quantidadeProdutos = 10;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = sc.nextDouble();
            somatorio += preco;
        }

        System.out.println("O somatório dos preços é: R$ " + df.format(somatorio));

        sc.close();
    }
}