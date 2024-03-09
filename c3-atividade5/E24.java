import java.util.Scanner;

public class E24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros. Digite 0 para parar.");
        int pares = 0;
        int impares = 0;
        int numero = s.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            numero = s.nextInt();
        }

        System.out.println("pares entre primeirp e o ultimo " + pares);
        System.out.println("impares entre o primeiro e ultimo " + impares);
        s.close();
    }
}
