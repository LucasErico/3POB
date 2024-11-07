package ProjetoBravo.controle;
import  ProjetoBravo.dominio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaProduto {
    private ArrayList<Paciente> pacientes;
    
    public ControlaProduto()
    {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor)
    {
        Paciente paciente = new Paciente(id, nome, valor);
        pacientes.add(paciente);
        System.out.println("\nProduto adicionado com sucesso!");
    }

    public void listarProduto()
    {
        if(pacientes.isEmpty())
        {
            System.out.println("\nNenhum produto cadastrado!");
        }
        else
        {
            for(Paciente paciente: pacientes)
            {
                System.out.println("------------------------------");
                paciente.listarPaciente();
                System.out.println("------------------------------");
            }
        }
    }

    public void alterarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) 
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Novo nome do produto: ");
            double novoPeso = entrada.nextDouble();
            System.out.print("Novo valor do produto: ");
            double novaAltura= entrada.nextDouble();
            
            paciente.setPeso(novoPeso);
            paciente.setAltura(novaAltura);
            System.out.println("Paciente alterado com sucesso!");

        } 
        else 
        {
            System.out.println("Paciente com Número " + numero + " não encontrado.");
        }
       
    }

    public void excluirProduto(int id) {
        Produto produto = buscarProdutoPorId(id);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    private Paciente buscarPacientePorNumero(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                return paciente;
            }
        }
        return null;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
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
                    System.out.print("Entre com o nome do produto: ");
                    scanner.skip("\n");
                    String nome = scanner.nextLine();
                    System.out.print("Entre com o valor do produto: ");
                    double valor = scanner.nextDouble();
                    controle.adicionarProduto(id, nome, valor);
                    break;

                case 2:

                    clearScreen();
                    System.out.println("\n\t--- LISTA DE PRODUTOS ---\n");
                    controle.listarProduto();        
                    break;

                case 3:

                    System.out.print("ID do Produto a alterar: ");
                    int idAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarProduto(idAlterar);
                    break;

                case 4:

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
            scanner.skip("\n");
            scanner.nextLine();

        }while(opcao!=5);
        
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
