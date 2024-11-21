package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            quadrados.add(numero * numero);
        }

        System.out.println("\nOs quadrados dos números são:");
        for (int quadrado : quadrados) {
            System.out.println(quadrado);
        }

        sc.close();
    }
}