import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int radio;
            do {
                System.out.print("Ingrese el radio de la esfera: ");
                radio = scanner.nextInt();
            } while (radio < 0);
            double volumen =  1.33333*3.14159*Math.pow(radio,3) ;
            System.out.println("El volumen de la esfera es "+ volumen);
            System.out.println("Quiere calcular otro volumen? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
