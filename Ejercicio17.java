import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Ingrese numero: ");
            int numero = scanner.nextInt();
            int factorial = 1;
            for (int i = numero; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("El factorial de "+ numero + " es "+factorial);
            System.out.print("Quiere calcular otro factorial? ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
