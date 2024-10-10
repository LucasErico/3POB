package exerciciosHeranca.projetoEmpresa.dominio;
import java.text.DecimalFormat;

public class Gerente extends Funcionario {
    
    protected double gratificacao;
    DecimalFormat decimal = new DecimalFormat("0.00");

    public Gerente(String matricula, String cpf, String nome, double salario, double gratificacao)
    {
        super(matricula, cpf, nome, salario);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Gratificação: "+decimal.format(gratificacao));
    }

}
