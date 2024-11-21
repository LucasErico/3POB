package lista4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        double somaNotas = 0.0;
        int quantidadeAlunos = 10;

        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            String nome = sc.next();
            nomes.add(nome);

            System.out.print("Digite a nota do aluno " + nome + ": ");
            double nota = sc.nextDouble();
            notas.add(nota);

            somaNotas += nota;
        }

        double mediaNotas = somaNotas / quantidadeAlunos;

        System.out.println("\nA média da turma é: " + String.format("%.2f", mediaNotas));

        System.out.println("Alunos com notas superiores à média:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas.get(i) > mediaNotas) {
                System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
            }
        }

        sc.close();
    }
}