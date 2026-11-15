import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el peso de los cuatro pasajeros
        System.out.print("Peso del pasajero 1 (kg): ");
        double p1 = sc.nextDouble();
        System.out.print("Peso del pasajero 2 (kg): ");
        double p2 = sc.nextDouble();
        System.out.print("Peso del pasajero 3 (kg): ");
        double p3 = sc.nextDouble();
        System.out.print("Peso del pasajero 4 (kg): ");
        double p4 = sc.nextDouble();

        // Sumar pesos y verificar que no rebase 320.0 kg
        double cargaTotal = p1 + p2 + p3 + p4;
        boolean dentroDelLimite = cargaTotal <= 320.0;

        // Mostrar resultado
        System.out.println("¿Carga permitida en el elevador?: " + dentroDelLimite);

        sc.close();
    }
}