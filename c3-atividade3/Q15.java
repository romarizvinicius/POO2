import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite sua altura: ");
        double altura = s.nextDouble();

        System.out.println("digite seu peso: ");
        double peso = s.nextDouble();

        double IMC = (peso % (altura * altura));

        System.out.println("seu IMC é: " + IMC);
        s.close();
    }
    
}
