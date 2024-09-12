package lista3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        DecimalFormat horario = new DecimalFormat("00");
        

        System.out.print("Entre com a massa inicial em gramas: ");
        float massa = scanner.nextFloat();
        massa = Float.MAX_VALUE;
        int tempo = 0;

        while (massa >= 0.5) 
        {
            massa = massa/2;
            tempo += 50;
        }

        int segundos = tempo%60;
        int minutos = tempo/60;
        int horas = minutos/60;

        minutos = minutos%60;

        System.out.println("Massa final: "+decimal.format(massa));
        System.out.println("Tempo: "+horario.format(horas)+":"+horario.format(minutos)+":"+horario.format(segundos));

        scanner.close();
    }
}
