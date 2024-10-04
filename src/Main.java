import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmero | Cuadrado | Cubo");
        for (int i = 0; i < 20; i++) {
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * numeros[i] * numeros[i];
            System.out.println(numeros[i] + "      | " + cuadrado + "       | " + cubo);
        }

        sc.close();
    }
}
