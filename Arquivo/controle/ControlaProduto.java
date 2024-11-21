package Arquivo.controle;

import Arquivo.dominio.Produto;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaProduto {
    private ArrayList<Produto> produtos;
    private final String arquivoProdutos = "produtos.txt";

    public ControlaProduto() {
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        salvarProdutos();
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if(produtos.isEmpty())
        {
            System.out.println("\nNenhum produto cadastrado!");
        }
        else
        {
            for(Produto produto: produtos)
            {
                System.out.println("------------------------------");
                produto.listarProduto();
                System.out.println("------------------------------");
            }
        }
    }

    public void alterarProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            Scanner entrada = new Scanner(System.in);
            System.out.println();
            System.out.print("Novo nome do produto: ");
            String novoNome = entrada.nextLine();
            System.out.println();
            System.out.print("Novo valor do produto: ");
            double novoValor = entrada.nextDouble();
            
            produto.setNome(novoNome);
            produto.setValor(novoValor);
            salvarProdutos();
            System.out.println();
            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println();
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }


    public void excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            salvarProdutos();
            System.out.println();
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println();
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getID() == id) {
                return produto;
            }
        }
        return null;
    }

    // Método para salvar produtos no arquivo
    private void salvarProdutos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoProdutos))) {
            for (Produto produto : produtos) {
                writer.write(produto.getID() + ";" + produto.getNome() + ";" + produto.getValor());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    // Método para carregar produtos do arquivo
    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoProdutos))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double valor = Double.parseDouble(dados[2]);
                produtos.add(new Produto(id, nome, valor));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de produtos não encontrado. Será criado ao salvar novos produtos.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }

public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
}  

public static void main(String[] args) {

        ControlaProduto controle = new ControlaProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.flush();
            //opcao = menu();
            clearScreen();
            System.out.println("\n\t--- MENU ---\n");
            System.out.println("Opção 1: Adicionar produto");
            System.out.println("Opção 2: Listar produtos");
            System.out.println("Opção 3: Alterar produto");
            System.out.println("Opção 4: Excluir produto");
            System.out.println("Opção 5: Sair\n");
        
            System.out.print("Opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:

                    clearScreen();
                    System.out.println("\n\t--- ADICIONAR PRODUTO ---\n");
                    System.out.print("Entre com o ID do produto: ");
                    int id = scanner.nextInt();
                    System.out.println();
                    System.out.print("Entre com o nome do produto: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println();
                    System.out.print("Entre com o valor do produto: ");
                    double valor = scanner.nextDouble();
                    controle.adicionarProduto(id, nome, valor);
                    break;

                case 2:

                    clearScreen();
                    System.out.println("\n\t--- LISTA DE PRODUTOS ---\n");
                    controle.listarProdutos();        
                    break;

                case 3:
                    clearScreen();
                    System.out.println("\n\t--- ALTERAR PRODUTO ---\n");
                    System.out.print("ID do Produto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarProduto(idAlterar);
                    break;

                case 4:
                    clearScreen();
                    System.out.println("\n\t--- EXCLUIR PRODUTO ---\n");
                    System.out.print("ID do Produto a excluir: ");
                    int idExcluir = scanner.nextInt();
                    controle.excluirProduto(idExcluir);
                    break;
            
                case 5:
                    System.out.println("\nEncerrado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }

   
            System.out.println("\nAperte qualquer tecla para continuar...");
            //scanner.skip("\n");
            scanner.nextLine();
            scanner.nextLine();
        } while (opcao != 0);

        scanner.close();
    }
}
