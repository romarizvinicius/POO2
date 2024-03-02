import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo:");
        double base = s.nextDouble();

        System.out.println("Digite o valor da altura do triângulo:");
        double altura = s.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);

        s.close();
    }
    
}
