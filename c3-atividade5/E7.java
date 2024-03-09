import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero ");
        int numero = s.nextInt();

        int invertido = 0;

        while (numero != 0){
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        System.out.println("o numero invertido é " + invertido);
        s.close();
    }
}
