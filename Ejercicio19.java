import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar coordenadas de dos puntos distintos en x
        System.out.print("Ingresa x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingresa y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ingresa x2 (distinto de x1): ");
        double x2 = sc.nextDouble();
        System.out.print("Ingresa y2: ");
        double y2 = sc.nextDouble();

        // Calcular pendiente m = (y2 - y1) / (x2 - x1) y evaluar si es positiva
        double pendiente = (y2 - y1) / (x2 - x1);
        boolean pendientePositiva = pendiente > 0.0;

        // Imprimir resultado
        System.out.println("¿La pendiente de la recta es positiva?: " + pendientePositiva);

        sc.close();
    }
}