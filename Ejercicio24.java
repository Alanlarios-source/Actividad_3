import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar calificación decimal
        System.out.print("Ingresa la calificación: ");
        double calificacion = sc.nextDouble();

        // Validar que se encuentre entre 0.0 y 10.0 inclusive
        boolean calificacionValida = (calificacion >= 0.0) && (calificacion <= 10.0);

        // Mostrar resultado
        System.out.println("¿La calificación es válida?: " + calificacionValida);

        sc.close();
    }
}