import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Ingrese un numero: ");
            int n = scanner.nextInt();
            if (n%2 == 0) {
                System.out.println(n + " es par");
            } else{
                System.out.println(n + " es impar");
            }
            System.out.print("Quiere ingresar otro numero? (n/no para salir): ");
            respuesta = scanner.next().toLowerCase();
        } while (!respuesta.equals("n") && !respuesta.equals("no"));
        scanner.close();
    }
}
