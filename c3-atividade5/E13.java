import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero ");
        int numero = s.nextInt();

        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        System.out.println(soma * soma * soma);
        s.close();
    }
}
