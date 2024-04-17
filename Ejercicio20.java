import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            long n, elevado;
            do {
                System.out.print("Ingrese el numero a calcular: ");
                n = scanner.nextInt();
                System.out.print("Ingrese la potencia a usar: ");
                elevado = scanner.nextInt();
            } while (n < 0 || elevado < 0);
            long result = 1;
            for (long i = 0; i < elevado; i++) {
                result *= n;
            }
            System.out.println("El resultado es " + result);
            System.out.print("Quiere calcular otro numero? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
