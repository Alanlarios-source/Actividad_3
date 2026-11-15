import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar saldo actual y monto a retirar
        System.out.print("Ingresa el saldo actual de la cuenta: ");
        double saldoActual = sc.nextDouble();
        System.out.print("Ingresa el monto que deseas retirar: ");
        double montoRetiro = sc.nextDouble();

        // Evaluar si el saldo es mayor o igual al retiro
        boolean saldoSuficiente = saldoActual >= montoRetiro;

        // Mostrar resultado booleano
        System.out.println("¿Saldo suficiente para el retiro?: " + saldoSuficiente);

        sc.close();
    }
}