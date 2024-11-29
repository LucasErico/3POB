package controller;

import java.io.*;
import java.util.ArrayList;

public class ArquivoController {

    private static final String arquivoFuncionarios = "funcionarios.txt";

    // Método para ler os dados do arquivo e retornar uma lista de funcionários
    public static ArrayList<Funcionario> lerArquivo() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoFuncionarios))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Dividir a linha por ponto e vírgula (;)
                String[] dados = linha.split(";");
                if (dados.length == 4) {
                    int id = Integer.parseInt(dados[0]);
                    String tipo = dados[1];
                    String nome = dados[2];
                    double salario = Double.parseDouble(dados[3]);

                    // Criar objeto Funcionario baseado no tipo
                    Funcionario funcionario = null;
                    switch (tipo) {
                        case "Desenvolvedor":
                            funcionario = new Desenvolvedor(nome, salario);
                            break;
                        case "Gerente":
                            funcionario = new Gerente(nome, salario);
                            break;
                        case "Treinador":
                            funcionario = new Treinador(nome, salario);
                            break;
                        case "GerenteDesenvolvedor":
                            funcionario = new GerenteDesenvolvedor(nome, salario);
                            break;
                    }

                    if (funcionario != null) {
                        funcionario.setId(id); // Define o ID (caso seja necessário)
                        funcionarios.add(funcionario);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    // Método para escrever todos os funcionários no arquivo
    public static void escreverArquivo(ArrayList<Funcionario> funcionarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoFuncionarios))) {
            for (Funcionario funcionario : funcionarios) {
                // Escrever as informações do funcionário no arquivo
                writer.write(funcionarioToString(funcionario));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para adicionar um novo funcionário ao arquivo
    public static void adicionarFuncionario(Funcionario funcionario) {
        ArrayList<Funcionario> funcionarios = lerArquivo();
        funcionarios.add(funcionario);  // Adiciona o novo funcionário na lista
        escreverArquivo(funcionarios);  // Reescreve o arquivo com todos os funcionários
    }

    // Método para atualizar um funcionário no arquivo
    public static void atualizarFuncionario(int id, Funcionario funcionarioAtualizado) {
        ArrayList<Funcionario> funcionarios = lerArquivo();
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            if (funcionario.getId() == id) {
                funcionarios.set(i, funcionarioAtualizado);  // Atualiza o funcionário
                escreverArquivo(funcionarios);  // Reescreve o arquivo com a lista atualizada
                return;
            }
        }
    }

    // Método para remover um funcionário do arquivo
    public static void removerFuncionario(int id) {
        ArrayList<Funcionario> funcionarios = lerArquivo();
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);  // Remove o funcionário
        escreverArquivo(funcionarios);  // Reescreve o arquivo sem o funcionário excluído
    }

    // Método para converter o objeto Funcionario para uma linha no formato adequado
    private static String funcionarioToString(Funcionario funcionario) {
        String tipo = "";
        if (funcionario instanceof Desenvolvedor) {
            tipo = "Desenvolvedor";
        } else if (funcionario instanceof Gerente) {
            tipo = "Gerente";
        } else if (funcionario instanceof Treinador) {
            tipo = "Treinador";
        } else if (funcionario instanceof GerenteDesenvolvedor) {
            tipo = "GerenteDesenvolvedor";
        }

        return funcionario.getId() + ";" + tipo + ";" + funcionario.getNome() + ";" + funcionario.getSalario();
    }
}
