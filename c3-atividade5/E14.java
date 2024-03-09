import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        while (numero <= 99) {
            if (numero % 2 == 1) {
                System.out.println(numero);
            }
            numero++;

        }
        s.close();
    }
}
