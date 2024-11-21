package lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o preço unitário do produto: ");
        double precoUnitario = sc.nextDouble();
        System.out.print("Escolha a forma de pagamento (1 - Dinheiro, 2 - Pix, 3 - Cartão débito, 4 - Cartão crédito): ");
        int formaPagamento = sc.nextInt();

        double valorTotal = quantidade * precoUnitario;
        double desconto = 0;

        switch (formaPagamento) {
            case 1: 
                desconto = 0.10;
                break;
            case 2: 
                desconto = 0.12;
                break;
            case 3: 
                desconto = 0.05;
                break;
            case 4: 
                desconto = 0.03;
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                return;
        }

        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Valor total: R$ " + df.format(valorTotal));
        System.out.println("Desconto: R$ " + df.format(valorDesconto));
        System.out.println("Valor final a pagar: R$ " + df.format(valorFinal));

        sc.close();
    }
}