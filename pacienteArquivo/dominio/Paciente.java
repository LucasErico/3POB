package pacienteArquivo.dominio;
import java.text.DecimalFormat;

public class Paciente
{

    private int numero;
    private double peso;
    private double altura;

    DecimalFormat decimal = new DecimalFormat("0.00");

    public Paciente(int numero, double peso, double altura)
    {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public void listarPaciente()
    {
        System.out.println("\nNúmero: "+numero+"\nPeso: "+decimal.format(peso)+"kg\nAltura: "+decimal.format(altura)+"m\n");
    }

}
