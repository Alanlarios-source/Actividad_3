import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        // Evaluar divisibilidad exacta entre 2 Y entre 5 simultáneamente
        boolean divisible2Y5 = ((numero % 2) == 0) && ((numero % 5) == 0);

        // Mostrar resultado
        System.out.println("¿Es divisible entre 2 y 5 a la vez?: " + divisible2Y5);

        sc.close();
    }
}