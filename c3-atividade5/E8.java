import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }
        System.out.println(soma);
        s.close();
    }
}
