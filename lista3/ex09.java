package lista3;

public class ex09 {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão de Fahrenheit para Celsius");
        System.out.println("----------------------------------------------");
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("----------------------------------------------");

        for (int fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {

            double celsius = 5.0 / 9.0 * (fahrenheit - 32);
            
            System.out.println(fahrenheit + "\t\t" + String.format("%.2f", celsius));
        }
    }
}