import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar velocidad inicial, aceleración y tiempo
        System.out.print("Ingresa la velocidad inicial (vo): ");
        double vo = sc.nextDouble();
        System.out.print("Ingresa la aceleración (a): ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el tiempo transcurrido (t): ");
        double t = sc.nextDouble();

        // Jerarquía: se resuelve primero el producto (a * t) y luego se suma vo
        double vf = vo + (a * t);

        // Mostrar velocidad final
        System.out.println("La velocidad final es: " + vf);

        sc.close();
    }
}