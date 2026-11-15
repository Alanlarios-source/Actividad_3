import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar lado del cuadrado y lado del triángulo equilátero
        System.out.print("Ingresa el lado del cuadrado: ");
        double ladoC = sc.nextDouble();
        System.out.print("Ingresa el lado del triángulo equilátero: ");
        double ladoT = sc.nextDouble();

        // Calcular perímetros y evaluar si el del cuadrado es menor
        double perimetroCuadrado = 4.0 * ladoC;
        double perimetroTriangulo = 3.0 * ladoT;
        boolean cuadradoMenor = perimetroCuadrado < perimetroTriangulo;

        // Imprimir resultado
        System.out.println("¿El perímetro del cuadrado es menor que el del triángulo?: " + cuadradoMenor);

        sc.close();
    }
}