package Arquivo.dominio;
import java.text.DecimalFormat;

public class Produto 
{

    private int ID;
    private String nome;
    private double valor;

    DecimalFormat decimal = new DecimalFormat("0.00");

    public Produto(int ID, String nome, double valor)
    {
        this.ID = ID;
        this.nome = nome;
        this.valor = valor;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public void listarProduto()
    {
        System.out.println("\nID: "+ID+"\nNome: "+nome+"\nValor: R$"+decimal.format(valor)+"\n");
    }

}
