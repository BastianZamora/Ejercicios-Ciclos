import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int lado1, lado2;
            do {
                System.out.print("Ingrese el largo del rectangulo: ");
                lado1 = scanner.nextInt();
                System.out.print("Ingrese el alto del rectangulo: ");
                lado2 = scanner.nextInt();

            } while (lado1 < 0 || lado2 < 0);
            double area = lado1 * lado2;
            System.out.println("El area del rectangulo es "+ area);
            System.out.println("Quiere calcular otra area? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
