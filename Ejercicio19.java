import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int lado;
            do {
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = scanner.nextInt();
            } while (lado < 0);
            double perimetro =  lado*4;
            double area =  lado * lado;
            System.out.println("El perimetro del cuadrado es " + perimetro + " cm");
            System.out.println("El area del cuadrado es " + area + " cm^2");
            System.out.print("Quiere hacer otro cálculo? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
