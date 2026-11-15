import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar dimensiones de la pared y precio por metro cuadrado
        System.out.print("Ingresa el ancho de la pared (m): ");
        double ancho = sc.nextDouble();
        System.out.print("Ingresa el alto de la pared (m): ");
        double alto = sc.nextDouble();
        System.out.print("Ingresa el precio por metro cuadrado de pintura: ");
        double precioMetro = sc.nextDouble();

        // Calcular área y costo total
        double area = ancho * alto;
        double costoTotal = area * precioMetro;

        // Mostrar resultados
        System.out.println("Área total a pintar: " + area + " m²");
        System.out.println("Costo total de pintura: $" + costoTotal);

        sc.close();
    }
}