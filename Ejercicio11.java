import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar temperatura del líquido en grados Celsius
        System.out.print("Ingresa la temperatura del líquido (°C): ");
        double temperatura = sc.nextDouble();

        // Evaluar si alcanzó o superó los 100.0 grados
        boolean puntoEbullicion = temperatura >= 100.0;

        // Mostrar resultado booleano
        System.out.println("¿Alcanzó el punto de ebullición?: " + puntoEbullicion);

        sc.close();
    }
}