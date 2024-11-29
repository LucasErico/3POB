package model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve{
    
    public void GerenteDesenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " está organizando a equipe.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " está conduzindo uma reunião.");
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " está codando.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " está resolvendo problemas.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente-desenvolvedor - Nome: " + getNome() + ", Salário: " + getSalario());
    }
}

