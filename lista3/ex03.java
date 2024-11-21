package lista3;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int somaIdades = 0;
        int quantidadePessoas = 10;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("A média das idades é: " + mediaIdades);

        sc.close();
    }
}