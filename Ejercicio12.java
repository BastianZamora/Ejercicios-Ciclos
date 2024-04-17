import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            int largo;
            do {
                System.out.print("Ingrese el largo del cubo: ");
                largo = scanner.nextInt();
            } while (largo < 0);
            double perimetro =  12*largo;
            double area =  (Math.pow(largo,2) * 6);
            System.out.println("El perimetro del cubo es "+ perimetro);
            System.out.println("El area del cubo es "+ area);
            System.out.println("Quiere hacer otro calculo? (si/no): ");
            respuesta = scanner.next();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
