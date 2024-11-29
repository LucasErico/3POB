package view;

import controller.FuncionarioController;
import java.util.Scanner;

public class MenuPrincipal {
    private FuncionarioController controller;
    private Scanner scanner;

    public MenuPrincipal(FuncionarioController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Dados de Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer.

            switch (opcao) {
                case 1:
                    exibirMenuCadastro();
                    break;
                case 2:
                    controller.listarFuncionarios();
                    break;
                case 3:
                    atualizarFuncionario();
                    break;
                case 4:
                    excluirFuncionario();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private void exibirMenuCadastro() {
        System.out.println("\n--- Tipos de Funcionários ---");
        System.out.println("1. Desenvolvedor");
        System.out.println("2. Gerente");
        System.out.println("3. Treinador");
        System.out.println("4. Gerente Desenvolvedor");
        System.out.print("Escolha o tipo de funcionário para cadastrar: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer.

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer.

        controller.cadastrarFuncionario(tipo, nome, salario);
    }

    private void atualizarFuncionario() {
        controller.listarFuncionarios();
        System.out.print("\nDigite o ID do funcionário a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer.

        System.out.print("Novo Nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo Salário: ");
        double novoSalario = scanner.nextDouble();

        controller.atualizarFuncionario(id, novoNome, novoSalario);
    }

    private void excluirFuncionario() {
        controller.listarFuncionarios();
        System.out.print("\nDigite o ID do funcionário a ser excluído: ");
        int id = scanner.nextInt();

        controller.excluirFuncionario(id);
    }
}
