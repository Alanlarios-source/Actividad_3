import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número entero cualquiera
        System.out.print("Ingresa un número entero (n): ");
        int n = sc.nextInt();

        // Un número es impar si su residuo al dividir entre 2 es distinto de 0
        boolean esImpar = (n % 2) != 0;

        // Mostrar resultado
        System.out.println("¿El número es impar?: " + esImpar);

        sc.close();
    }
}