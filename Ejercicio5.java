import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 30; i++) {
            System.out.print("Ingrese numero: ");
            int n = scanner.nextInt();
            suma += n;
        }
        double promedio = suma/30;
        System.out.println("El promedio de los números es "+ promedio);
        scanner.close();
    }
}
