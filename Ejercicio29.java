import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar edad en años y peso en kilogramos
        System.out.print("Ingresa la edad en años: ");
        int edad = sc.nextInt();
        System.out.print("Ingresa el peso en kilogramos: ");
        double peso = sc.nextDouble();

        // Evaluar edad entre 18 y 65 (inclusive) Y peso mayor a 50.0 kg
        boolean aptoParaDonar = (edad >= 18) && (edad <= 65) && (peso > 50.0);

        // Mostrar resultado
        System.out.println("¿Es elegible para donar sangre?: " + aptoParaDonar);

        sc.close();
    }
}