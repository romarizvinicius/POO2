import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite um numero decimal: ");
        double numero1 = s.nextDouble();

        int numeroInt = (int)numero1;

        System.out.println(numeroInt);
        s.close();
    }
}
