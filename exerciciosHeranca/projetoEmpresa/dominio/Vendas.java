package exerciciosHeranca.projetoEmpresa.dominio;
import java.text.DecimalFormat;

public class Vendas extends Gerente {
    
    protected double participacaoLucros;
    DecimalFormat decimal = new DecimalFormat("0.00");

    public Vendas(String matricula, String cpf, String nome, double salario, double gratificacao, double participacaoLucros)
    {
        super(matricula, cpf, nome, salario, gratificacao);
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() 
    {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) 
    {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Participação nos Lucros: "+decimal.format(participacaoLucros));
    }
}
