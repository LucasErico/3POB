package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> matriculas = new ArrayList<>();
        ArrayList<Double> salariosBrutos = new ArrayList<>();
        double descontoPercentual = 0.11; 

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite a matrícula do empregado " + i + ": ");
            String matricula = sc.next();
            matriculas.add(matricula);

            System.out.print("Digite o salário bruto do empregado " + i + ": ");
            double salarioBruto = sc.nextDouble();
            salariosBrutos.add(salarioBruto);
        }

        System.out.println("\nFolha de pagamento:");
        System.out.println("Matrícula\tSalário Bruto\tDesconto (11%)\tSalário Líquido");
        for (int i = 0; i < matriculas.size(); i++) {
            double salarioBruto = salariosBrutos.get(i);
            double desconto = salarioBruto * descontoPercentual;
            double salarioLiquido = salarioBruto - desconto;

            System.out.println(matriculas.get(i) + "\t\tR$ " + String.format("%.2f", salarioBruto) 
                + "\t\tR$ " + String.format("%.2f", desconto) 
                + "\t\tR$ " + String.format("%.2f", salarioLiquido));
        }

        sc.close();
    }
}