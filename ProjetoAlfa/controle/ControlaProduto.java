package ProjetoAlfa.controle;
import  ProjetoAlfa.dominio.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaProduto {
    private ArrayList<Produto> produtos;
    
    public ControlaProduto()
    {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor)
    {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProduto()
    {
        if(produtos.isEmpty())
        {
            System.out.println("Nenhum produto cadastrado!");
        }
        else
        {
            System.out.println("Lista de produtos");
            for(Produto produto: produtos)
            {
                produto.listarProduto();
            }
        }
    }

    public static void main(String[] args)
    {
        ControlaProduto controle = new ControlaProduto();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do
        {
            System.out.flush();
            //opcao = menu();

            System.out.println("Opção 1: Adicionar produto");
            System.out.println("Opção 2: Listar produtos");
            System.out.println("Opção 3: Sair");
        
            System.out.print("Opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:

                    System.out.print("Entre com o ID do produto: ");
                    int id = scanner.nextInt();
                    System.out.print("Entre com o nome do produto: ");
                    scanner.skip("\n");
                    String nome = scanner.nextLine();
                    System.out.print("Entre com o valor do produto: ");
                    double valor = scanner.nextDouble();
                    controle.adicionarProduto(id, nome, valor);
                    break;
            
                case 2:
                    controle.listarProduto();        
                    break;
            

                case 3:
                    System.out.println("Encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(opcao!=3);
        
        scanner.close();

    }

    /* 
    public static int menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opção 1: Adicionar produto");
        System.out.println("Opção 2: Listar produtos");
        System.out.println("Opção 3: Sair");
        
        
        System.out.print("Opção desejada: ");
        int opcao = scanner.nextInt();

        scanner.close();

        return opcao;

    }
    */
}
