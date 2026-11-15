import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar tres calificaciones parciales
        System.out.print("Ingresa la calificación parcial 1: ");
        double c1 = sc.nextDouble();
        System.out.print("Ingresa la calificación parcial 2: ");
        double c2 = sc.nextDouble();
        System.out.print("Ingresa la calificación parcial 3: ");
        double c3 = sc.nextDouble();

        // Calcular promedio y verificar que sea >= 8.0 y ninguna calificación sea < 7.0
        double promedio = (c1 + c2 + c3) / 3.0;
        boolean desempenoIntegral = (promedio >= 8.0) && (c1 >= 7.0) && (c2 >= 7.0) && (c3 >= 7.0);

        // Mostrar promedio y evaluación final
        System.out.println("Promedio obtenido: " + promedio);
        System.out.println("¿Cumple con el desempeño integral?: " + desempenoIntegral);

        sc.close();
    }
}