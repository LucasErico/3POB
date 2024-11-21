package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        System.out.println("Digite 10 números para a lista A:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + " para A: ");
            int numero = sc.nextInt();
            listaA.add(numero);
        }

        System.out.println("\nDigite 10 números para a lista B:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + " para B: ");
            int numero = sc.nextInt();
            listaB.add(numero);
        }

        for (int i = 0; i < 10; i++) {
            int soma = listaA.get(i) + listaB.get(i);
            listaC.add(soma);
        }

        System.out.println("\nOs valores da lista C (soma dos elementos de A e B) são:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + (i + 1) + "] = " + listaC.get(i));
        }

        sc.close();
    }
}