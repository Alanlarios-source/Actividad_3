import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar total de caramelos y capacidad por bolsa
        System.out.print("Ingresa el total de caramelos comprados: ");
        int totalCaramelos = sc.nextInt();
        System.out.print("Ingresa la capacidad de cada bolsa: ");
        int capacidadBolsa = sc.nextInt();

        // Calcular bolsas llenas y sobrantes mediante división entera y módulo
        int bolsasLlenas = totalCaramelos / capacidadBolsa;
        int caramelosSobrantes = totalCaramelos % capacidadBolsa;

        // Imprimir resultados
        System.out.println("Bolsas llenas por completo: " + bolsasLlenas);
        System.out.println("Caramelos sin empaquetar: " + caramelosSobrantes);

        sc.close();
    }
}