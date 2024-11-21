package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int maiorNumero = Integer.MIN_VALUE;
        int contagemMaior = 0;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);

            if (numero > maiorNumero) {
                maiorNumero = numero;
                contagemMaior = 1; 
            } else if (numero == maiorNumero) {
                contagemMaior++; 
            }
        }

        ArrayList<Integer> posicoes = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == maiorNumero) {
                posicoes.add(i + 1);
            }
        }

        System.out.println("\nO maior número é: " + maiorNumero);
        System.out.println("O maior número ocorre " + contagemMaior + " vezes.");
        System.out.print("O maior número aparece nas posições: ");
        for (int posicao : posicoes) {
            System.out.print(posicao + " ");
        }

        sc.close();
    }
}