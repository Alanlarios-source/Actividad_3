import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar distancia en kilómetros
        System.out.print("Ingresa la distancia en kilómetros: ");
        double km = sc.nextDouble();

        // Calcular equivalencias en variables separadas
        double millas = km * 0.621371;
        double pies = km * 3280.84;

        // Mostrar resultados
        System.out.println("Equivalencia en millas: " + millas);
        System.out.println("Equivalencia en pies: " + pies);

        sc.close();
    }
}