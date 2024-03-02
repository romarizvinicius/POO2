import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        double base = s.nextDouble();

        System.out.println("Digite o valor da altura do retângulo:");
        double altura = s.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.println("O perímetro do retângulo é: " + perimetro);

        s.close();
    }
}
