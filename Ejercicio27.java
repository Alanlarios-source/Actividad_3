import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar las longitudes de los tres lados del triángulo
        System.out.print("Ingresa el lado 1 (l1): ");
        double l1 = sc.nextDouble();
        System.out.print("Ingresa el lado 2 (l2): ");
        double l2 = sc.nextDouble();
        System.out.print("Ingresa el lado 3 (l3): ");
        double l3 = sc.nextDouble();

        // Verificar que los tres lados sean iguales entre sí y mayores que cero
        boolean esEquilatero = (l1 == l2) && (l2 == l3) && (l1 > 0.0);

        // Mostrar resultado
        System.out.println("¿Es un triángulo equilátero válido?: " + esEquilatero);

        sc.close();
    }
}