import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar dos números positivos
        System.out.print("Ingresa el primer número positivo (a): ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo número positivo (b): ");
        double b = sc.nextDouble();

        // Media armónica: doble del producto dividido entre la suma
        double mediaArmonica = (2.0 * a * b) / (a + b);

        // Imprimir resultado
        System.out.println("La media armónica es: " + mediaArmonica);

        sc.close();
    }
}