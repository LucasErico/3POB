package lista3;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0;
        int menoresDe18 = 0;
        int maioresOuIgual18 = 0;
        String continuar;

        do {

            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();

            if (idade < 18) {
                menoresDe18++;
            } else {
                maioresOuIgual18++;
            }

            totalPessoas++;

            System.out.print("Deseja cadastrar outra pessoa? (S para sim, N para não): ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        double porcentagemMenoresDe18 = ((double) menoresDe18 / totalPessoas) * 100;
        double porcentagemMaioresOuIgual18 = ((double) maioresOuIgual18 / totalPessoas) * 100;

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.println("Porcentagem de pessoas com idade inferior a 18 anos: " + String.format("%.2f", porcentagemMenoresDe18) + "%");
        System.out.println("Porcentagem de pessoas com idade igual ou superior a 18 anos: " + String.format("%.2f", porcentagemMaioresOuIgual18) + "%");

        sc.close();
    }
}