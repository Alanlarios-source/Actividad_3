import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar temperatura ambiente
        System.out.print("Ingresa la temperatura ambiente (°C): ");
        double temperatura = sc.nextDouble();

        // Evaluar rango de confort [18.0, 25.0] con operador lógico AND (&&)
        boolean rangoConfort = (temperatura >= 18.0) && (temperatura <= 25.0);

        // Mostrar resultado
        System.out.println("¿Temperatura en rango confortable?: " + rangoConfort);

        sc.close();
    }
}