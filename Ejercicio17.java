import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar dos números enteros a y b
        System.out.print("Ingresa el valor entero de a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el valor entero de b: ");
        int b = sc.nextInt();

        // Evaluar mediante igualdad estricta si a^2 es igual a b
        boolean esCuadradoExacto = (a * a) == b;

        // Imprimir resultado
        System.out.println("¿El cuadrado de a es igual a b?: " + esCuadradoExacto);

        sc.close();
    }
}