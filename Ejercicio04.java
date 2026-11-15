import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar cantidad entera de días
        System.out.print("Ingresa el total de días: ");
        int totalDias = sc.nextInt();

        // División entera para semanas completas y módulo para días sobrantes
        int semanas = totalDias / 7;
        int diasRestantes = totalDias % 7;

        // Imprimir desglose
        System.out.println("Semanas completas: " + semanas);
        System.out.println("Días sueltos restantes: " + diasRestantes);

        sc.close();
    }
}