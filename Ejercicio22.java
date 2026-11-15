import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar porcentaje de llenado del tanque (0 a 100)
        System.out.print("Ingresa el porcentaje de llenado del tanque (0 a 100): ");
        double porcentaje = sc.nextDouble();

        // Alerta si es menor a 10% O mayor a 95% usando operador lógico OR (||)
        boolean alertaCritica = (porcentaje < 10.0) || (porcentaje > 95.0);

        // Mostrar resultado
        System.out.println("¿Alerta de nivel crítico en tanque?: " + alertaCritica);

        sc.close();
    }
}