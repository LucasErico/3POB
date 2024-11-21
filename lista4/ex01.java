package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();
        
        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.print("Digite a altura de " + nome + " (em metros): ");
            double altura = sc.nextDouble();
            alturas.add(altura);
        }

        System.out.println("\nPessoas com mais de 1,70 metros de altura:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + ", Altura: " + alturas.get(i) + " metros");
            }
        }

        sc.close();
    }
}