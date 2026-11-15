import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el radio de la esfera
        System.out.print("Ingresa el radio de la esfera: ");
        double r = sc.nextDouble();

        // Usar 4.0 / 3.0 evita la división entera truncada; PI = 3.14159
        double volumen = (4.0 / 3.0) * 3.14159 * (r * r * r);

        // Imprimir el volumen calculado
        System.out.println("El volumen de la esfera es: " + volumen);

        sc.close();
    }
}