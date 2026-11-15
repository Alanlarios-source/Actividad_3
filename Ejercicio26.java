import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número entero
        System.out.print("Ingresa un número entero: ");
        int num = sc.nextInt();

        // Evaluar si tiene exactamente dos cifras positivas (10 al 99)
        boolean dosDigitosPositivos = (num >= 10) && (num <= 99);

        // Mostrar resultado
        System.out.println("¿Es un número positivo de dos dígitos?: " + dosDigitosPositivos);

        sc.close();
    }
}