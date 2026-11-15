import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        // El residuo de dividir entre 10 extrae la cifra de las unidades
        int ultimoDigito = numero % 10;

        // Imprimir exclusivamente el último dígito
        System.out.println("Cifra de las unidades: " + ultimoDigito);

        sc.close();
    }
}