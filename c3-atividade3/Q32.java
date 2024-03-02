import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência:");
        double raio = s.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O perímetro da circunferência é: " + perimetro);

        s.close();
    }
}
