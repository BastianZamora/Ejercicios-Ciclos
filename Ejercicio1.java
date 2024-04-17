import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("1) Ingresar una medida");
            System.out.println("2) Salir");
            System.out.print("Ingrese una opción: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    int km, m, cm;
                    System.out.print("Ingrese la medida en centimetros: ");
                    int medida = scanner.nextInt();
                    km = medida/100000;
                    m = (medida%100000)/100;
                    cm = medida%100;
                    System.out.println(km + " Kilometros");
                    System.out.println(m + " Metros");
                    System.out.println(cm + " Centimetros");
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Numero inválido");
                    break;
            }
        } while (op != 2);
        scanner.close();
    }
    
}