import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar tres valores decimales
        System.out.print("Ingresa el valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa el valor de y: ");
        double y = sc.nextDouble();
        System.out.print("Ingresa el valor de z: ");
        double z = sc.nextDouble();

        // Evaluar (x + 2y) / (z - x) respetando agrupación con paréntesis
        double resultado = (x + 2.0 * y) / (z - x);

        // Imprimir resultado
        System.out.println("El resultado de la expresión es: " + resultado);

        sc.close();
    }
}