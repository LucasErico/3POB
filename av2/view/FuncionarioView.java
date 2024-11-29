package view;

import model.Funcionario;

import java.util.List;

public class FuncionarioView {

    public void mostrarFuncionario(Funcionario funcionario) {
        System.out.println(funcionario.getId() + " - " +
                funcionario.getClass().getSimpleName() + " - Nome: " +
                funcionario.getNome() + ", Salário: " + funcionario.getSalario());
    }

    public void listarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.");
        } else {
            System.out.println("\n=== Lista de Funcionários ===");
            for (Funcionario funcionario : funcionarios) {
                mostrarFuncionario(funcionario);
            }
        }
    }

    public void mensagemErro(String mensagem) {
        System.out.println("Erro: " + mensagem);
    }

    public void mensagemSucesso(String mensagem) {
        System.out.println("Sucesso: " + mensagem);
    }
}
