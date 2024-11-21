package lista4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.println("\nNúmeros na ordem original: " + numeros);

        Collections.sort(numeros);
        System.out.println("Números em ordem crescente: " + numeros);
        
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Números em ordem decrescente: " + numeros);

        sc.close();
    }
}