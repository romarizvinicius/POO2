import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double numero= s.nextDouble();

        long numer = Math.round(numero);

        System.out.println("O número arredondado é: " + numer);
        s.close();
    }
}
