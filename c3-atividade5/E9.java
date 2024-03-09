import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = 1;
        int produto = 1;

        while (numero <= 5) {
            produto *= numero;
            numero++;
            
        }
        System.out.println(" o produto dos numeros de 1 a 5 e " + produto);
        s.close();
    }
}
