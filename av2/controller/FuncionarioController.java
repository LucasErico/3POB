package controller;

import model.*;
import view.FuncionarioView;

import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios;
    private ArquivoController arquivoController;
    private FuncionarioView view;
    private int proximoId; 

    public FuncionarioController() {
        this.arquivoController = new ArquivoController();
        this.funcionarios = arquivoController.carregarFuncionarios();
        this.view = new FuncionarioView();
        this.proximoId = calcularProximoId();
    }

    private int calcularProximoId() {
        int maiorId = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() > maiorId) {
                maiorId = funcionario.getId();
            }
        }
        return maiorId + 1;
    }
    
    public void cadastrarFuncionario(int tipo, String nome, double salario) {
        Funcionario funcionario = null;
        switch (tipo) {
            case 1 -> funcionario = new Desenvolvedor(nome, salario);
            case 2 -> funcionario = new Gerente(nome, salario);
            case 3 -> funcionario = new Treinador(nome, salario);
            case 4 -> funcionario = new GerenteDesenvolvedor(nome, salario);
            default -> {
                view.mensagemErro("Tipo inválido. Funcionário não cadastrado.");
                return;
            }
        }

        if (funcionario != null) {
            funcionario.setId(proximoId++);
            funcionarios.add(funcionario);
            arquivoController.salvarFuncionarios(funcionarios);
            view.mensagemSucesso("Funcionário cadastrado com sucesso! ID: " + funcionario.getId());
        }
    }

    public void listarFuncionarios() {
        view.listarFuncionarios(funcionarios);
    }

    public void atualizarFuncionario(int id, String novoNome, double novoSalario) {
        Funcionario funcionario = buscarFuncionarioPorId(id);
        if (funcionario != null) {
            funcionario.setNome(novoNome);
            funcionario.receberAumento(novoSalario - funcionario.getSalario());
            arquivoController.salvarFuncionarios(funcionarios);
            view.mensagemSucesso("Funcionário atualizado com sucesso!");
        } else {
            view.mensagemErro("Funcionário não encontrado.");
        }
    }

    public void excluirFuncionario(int id) {
        Funcionario funcionario = buscarFuncionarioPorId(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            arquivoController.salvarFuncionarios(funcionarios);
            view.mensagemSucesso("Funcionário excluído com sucesso!");
        } else {
            view.mensagemErro("Funcionário não encontrado.");
        }
    }

    private Funcionario buscarFuncionarioPorId(int id) {
        return funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }
}
