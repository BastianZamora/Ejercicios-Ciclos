public class Ejercicio7 {
    public static void main(String[] args) {
        int i = 0;
        int suma = 0;
        while (i<400) {
            if ((i%2) == 1) {
                suma += i;
            }
            i++;
        }
        System.out.println("La suma de los numeros impares hasta 400 es "+ suma);
    }
}
