package lista3;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisAlto = "";
        double alturaMaisAlta = 0.0;
        double somaAlturas = 0.0;
        int quantidadePessoas = 10;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();

            System.out.print("Digite a altura de " + nome + " (em metros): ");
            double altura = sc.nextDouble();

            somaAlturas += altura;

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        double alturaMedia = somaAlturas / quantidadePessoas;

        System.out.println("A altura média do grupo é: " + String.format("%.2f", alturaMedia) + " metros");
        System.out.println("A pessoa mais alta é " + nomeMaisAlto + " com " + String.format("%.2f", alturaMaisAlta) + " metros");

        sc.close();
    }
}