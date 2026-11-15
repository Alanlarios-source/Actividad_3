import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        // Comprobar divisibilidad exacta entre 7 con igualdad estricta
        boolean esMultiploDe7 = (numero % 7) == 0;

        // Imprimir resultado
        System.out.println("¿Es múltiplo de 7?: " + esMultiploDe7);

        sc.close();
    }
}