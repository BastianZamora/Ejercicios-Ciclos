public class Ejercicio15 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if ((i%5) != 0 && (i%3) != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
