package model;

public abstract class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // - GETTERS - //
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    // - SETTERS - //
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void mostrarDetalhes(); 

}


