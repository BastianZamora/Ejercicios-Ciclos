import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int radio;
            do {
                System.out.println("Ingrese el radio del círculo: ");
                radio = scanner.nextInt();
            } while (radio < 0);
            double perimetro = (3.14159 * radio)* 2;
            System.out.println("El perimetro del círculo es "+ perimetro);
            System.out.println("Quiere calcular otro perimetro? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
