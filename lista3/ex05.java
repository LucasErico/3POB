package lista3;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int abaixoDe160 = 0;
        int entre160e180 = 0;
        int acimaDe180 = 0;
        String continuar;

        do {

            System.out.print("Digite a altura da pessoa em metros (ex: 1.75): ");
            double altura = sc.nextDouble();

            if (altura < 1.60) {
                abaixoDe160++;
            } else if (altura <= 1.80) {
                entre160e180++;
            } else {
                acimaDe180++;
            }

            totalPessoas++;

            System.out.print("Deseja cadastrar outra pessoa? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Pessoas com altura inferior a 1,60 metros: " + abaixoDe160);
        System.out.println("Pessoas com altura entre 1,60 e 1,80 metros: " + entre160e180);
        System.out.println("Pessoas com altura superior a 1,80 metros: " + acimaDe180);

        sc.close();
    }
}