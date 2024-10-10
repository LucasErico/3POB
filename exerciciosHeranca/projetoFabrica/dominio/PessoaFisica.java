package exerciciosHeranca.projetoFabrica.dominio;

public class PessoaFisica extends Cliente {
    
    protected String nome;
    protected String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String telefone)
    {
        super(endereco, telefone);
        this.nome = nome;
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


    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    @Override
    public void exibir()
    {
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        super.exibir();
    }

}
