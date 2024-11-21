package ProjetoBravo.controle;
import  ProjetoBravo.dominio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaPaciente {
    private ArrayList<Paciente> pacientes;
    
    public ControlaPaciente()
    {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(int numero, double peso, double altura)
    {
        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
        System.out.println("\nPaciente adicionado com sucesso!");
    }

    public void listarPaciente()
    {
        if(pacientes.isEmpty())
        {
            System.out.println("\nNenhum paciente cadastrado!");
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
            System.out.println();
            System.out.print("Novo peso do paciente: ");
            double novoPeso = entrada.nextDouble();
            System.out.println();
            System.out.print("Nova altura do paciente: ");
            double novaAltura = entrada.nextDouble();
            
            paciente.setPeso(novoPeso);
            paciente.setAltura(novaAltura);
            System.out.println();
            System.out.println("Paciente alterado com sucesso!");

        } 
        else 
        {
            System.out.println();
            System.out.println("Paciente com Número " + numero + " não encontrado.");
        }
       
    }

    public void excluirPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            pacientes.remove(paciente);
            System.out.println();
            System.out.println("Paciente excluído com sucesso!");
        } else {
            System.out.println();
            System.out.println("Paciente com Número " + numero + " não encontrado.");
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

    public static int menu()
    {
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        System.out.println("\n\t--- MENU ---\n");
        System.out.println("Opção 1: Adicionar Paciente");
        System.out.println("Opção 2: Listar Pacientes");
        System.out.println("Opção 3: Alterar Paciente");
        System.out.println("Opção 4: Excluir Paciente");
        System.out.println("Opção 5: Sair\n");
        
        System.out.print("Opção desejada: ");
        int opcao = scanner.nextInt();

        //scanner.close();

        return opcao;

    }

    public static void main(String[] args)
    {
        ControlaPaciente controle = new ControlaPaciente();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do
        {
            System.out.flush();
            opcao = menu();
            /* 
            clearScreen();
            System.out.println("\n\t--- MENU ---\n");
            System.out.println("Opção 1: Adicionar paciente");
            System.out.println("Opção 2: Listar pacientes");
            System.out.println("Opção 3: Alterar paciente");
            System.out.println("Opção 4: Excluir paciente");
            System.out.println("Opção 5: Sair\n");
        
            System.out.print("Opção desejada: ");
            opcao = scanner.nextInt();
            */

            switch (opcao) 
            {
                case 1:

                    clearScreen();
                    System.out.println("\n\t--- ADICIONAR PACIENTE ---\n");
                    System.out.print("Entre com o número do paciente: ");
                    int numero = scanner.nextInt();
                    System.out.println();
                    System.out.print("Entre com o peso do paciente: ");
                    scanner.nextLine();
                    double peso = scanner.nextDouble();
                    System.out.println();
                    System.out.print("Entre com a altura do paciente: ");
                    double altura = scanner.nextDouble();
                    controle.adicionarPaciente(numero, peso, altura);
                    break;

                case 2:

                    clearScreen();
                    System.out.println("\n\t--- LISTA DE PACIENTES ---\n");
                    controle.listarPaciente();        
                    break;

                case 3:
                    clearScreen();
                    System.out.println("\n\t--- ALTERAR PACIENTE ---\n");
                    System.out.print("Número do paciente a alterar: ");
                    int numeroAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarPaciente(numeroAlterar);
                    break;

                case 4:
                    clearScreen();
                    System.out.println("\n\t--- EXCLUIR PACIENTE ---\n");
                    System.out.print("Número do paciente a excluir: ");
                    int numeroExcluir = scanner.nextInt();
                    controle.excluirPaciente(numeroExcluir);
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

        }while(opcao!=5);
        
        scanner.close();

    }

    /* 
    public static int menu()
    {
        clearScreen();
        System.out.println("\n\t--- MENU ---\n");
        System.out.println("Opção 1: Adicionar paciente");
        System.out.println("Opção 2: Listar pacientes");
        System.out.println("Opção 3: Alterar paciente");
        System.out.println("Opção 4: Excluir paciente");
        System.out.println("Opção 5: Sair\n");
        
        System.out.print("Opção desejada: ");
        opcao = scanner.nextInt();

        scanner.close();

        return opcao;

    }
    */
}
