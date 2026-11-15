import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        // Usar operador lógico NOT (!) sobre la comparación de múltiplo de 3
        boolean noMultiploDe3 = !((numero % 3) == 0);

        // Mostrar resultado
        System.out.println("¿El número NO es múltiplo de 3?: " + noMultiploDe3);

        sc.close();
    }
}