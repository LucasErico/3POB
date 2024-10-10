
package exerciciosHeranca.projetoEmpresa.dominio;
import java.text.DecimalFormat;

public class Funcionario {

    protected String matricula;
    protected String cpf;
    protected String nome;
    protected double salario;

    DecimalFormat decimal = new DecimalFormat("0.00");

    public Funcionario(String matricula, String cpf, String nome, double salario)
    {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }


    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public void exibir()
    {
        System.out.println("Matrícula: "+matricula);
        System.out.println("CPF: "+cpf);
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+decimal.format(salario));
    }

}
