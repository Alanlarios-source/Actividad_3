import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el subtotal de la cuenta
        System.out.print("Ingresa el subtotal de la cuenta: ");
        double subtotal = sc.nextDouble();

        // Calcular IVA (16%) y propina (15%) sobre el subtotal sin IVA
        double iva = subtotal * 0.16;
        double propina = subtotal * 0.15;
        double granTotal = subtotal + iva + propina;

        // Mostrar desglose y total
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Propina sugerida (15%): $" + propina);
        System.out.println("Gran total a pagar: $" + granTotal);

        sc.close();
    }
}