import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        // Verificar mediante módulo 10 si el último dígito es exactamente 5
        boolean terminaEn5 = (numero % 10) == 5;

        // Mostrar resultado
        System.out.println("¿La cifra final es exactamente 5?: " + terminaEn5);

        sc.close();
    }
}