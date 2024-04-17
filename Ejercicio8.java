import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int radio;
            do {
                System.out.println("Ingrese el radio del círculo: ");
                radio = scanner.nextInt();
            } while (radio < 0);
            double area = Math.pow((3.14159 * radio), 2);
            System.out.println("El área del círculo es "+ area);
            System.out.println("Quiere calcular otra área? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
