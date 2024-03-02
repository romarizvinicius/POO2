import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero decimal");
        double numero1 = s.nextDouble();

        System.out.println("digite outro numero decimal");
        double numero2 = s.nextDouble();

        double resto = numero1 % numero2;
        System.out.println("O resto da divisao é" + resto);
        s.close();
    }
    
}
