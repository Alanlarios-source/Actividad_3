import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar existencia actual y ventas del día
        System.out.print("Ingresa la existencia actual del producto: ");
        int existenciaActual = sc.nextInt();
        System.out.print("Ingresa la cantidad vendida hoy: ");
        int cantidadVendida = sc.nextInt();

        // Calcular inventario restante y verificar si es estrictamente menor a 15
        int restantes = existenciaActual - cantidadVendida;
        boolean debajoDeMinimo = restantes < 15;

        // Mostrar resultado
        System.out.println("¿Queda por debajo del stock mínimo de 15 piezas?: " + debajoDeMinimo);

        sc.close();
    }
}