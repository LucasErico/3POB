package exerciciosHeranca.projetoFabrica.controle;
import exerciciosHeranca.projetoFabrica.dominio.*;
import java.util.Scanner;

public class controlaFabrica {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO CLIENTE");

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Tipo (1-PF | 2-PJ): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if(tipo == 1)
        {
            System.out.println("CLIENTE PESSOA FÍSICA");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            PessoaFisica cliente = new PessoaFisica(nome, cpf, endereco, telefone);
            cliente.exibir();
        }
        else
        {
            System.out.println("CLIENTE PESSOA JURÍDICA");

            System.out.print("Razão Social: ");
            String razaoSocial = scanner.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();

            PessoaJuridica cliente = new PessoaJuridica(razaoSocial, cnpj, endereco, telefone);
            cliente.exibir();
        }

        scanner.close();

    }
}
