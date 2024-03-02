import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero para descobrir o seu dobro");
        double numero = s.nextDouble();

        double dobro = (numero * 2);

        System.out.println("o dobro do " + numero + " e´ " + dobro);
        s.close();
    }
}
