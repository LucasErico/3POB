package lista2;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = sc.nextDouble();
        System.out.print("Digite o valor de Z: ");
        double z = sc.nextDouble();

        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Os valores podem formar um triângulo.");
            
            if (x == y && y == z) {
                System.out.println("É um triângulo equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }

        sc.close();
    }
}