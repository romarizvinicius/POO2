import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        while (numero <= 50){
            if(numero % 3 == 0){
                System.err.println(numero);
            }
            numero++;
        }

        s.close();
    }
}
