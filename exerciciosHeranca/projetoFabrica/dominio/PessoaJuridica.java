package exerciciosHeranca.projetoFabrica.dominio;

public class PessoaJuridica extends Cliente {
    
    protected String razaoSocial;
    protected String cnpj;

    public PessoaJuridica(String razaoSocial, String cnpj, String endereco, String telefone)
    {
        super(endereco, telefone);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial()
    {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial)
    {
        this.razaoSocial = razaoSocial;
    }


    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    @Override
    public void exibir()
    {
        System.out.println("Nome: "+razaoSocial);
        System.out.println("CPF: "+cnpj);
        super.exibir();
    }

}
