import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double reais = s.nextDouble();

        System.out.println("Digite o dolar: ");
        double dolar = s.nextDouble();

        double valor = reais / dolar;

        System.out.println("o valor em dolares e: " + valor);
        s.close();
    }
}
