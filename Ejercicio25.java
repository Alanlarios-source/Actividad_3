import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar edad y posesión de credencial de estudiante
        System.out.print("Ingresa la edad del pasajero: ");
        int edad = sc.nextInt();
        System.out.print("¿Tiene credencial de estudiante? (1 para sí, 0 para no): ");
        int credencial = sc.nextInt();

        // Viaja gratis si es menor de 6 años O tiene credencial vigente
        boolean accesoGratuito = (edad < 6) || (credencial == 1);

        // Mostrar resultado
        System.out.println("¿Tiene acceso gratuito al transporte?: " + accesoGratuito);

        sc.close();
    }
}