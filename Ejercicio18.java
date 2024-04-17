import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Ingrese un número: ");
            int n = scanner.nextInt();
            int digitos = 1;
            if (n < 10) {
                System.out.println("El número tiene 1 dígito");
            }else{
                while ((n/10)!=0) {
                    digitos += 1;
                    n = n/10;
                }
                System.out.println("El número tiene "+digitos+" dígitos");
            }
            System.out.print("Quiere ingresar otro numero? (n/no para salir): ");
            respuesta = scanner.next().toLowerCase();
        } while (!respuesta.equals("no"));
        scanner.close();
    }
}
