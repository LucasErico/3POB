package lista3;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE; 
        String continuar;

        do {
   
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            System.out.print("Deseja digitar outro número? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("O maior número digitado foi: " + maiorNumero);

        sc.close();
    }
}