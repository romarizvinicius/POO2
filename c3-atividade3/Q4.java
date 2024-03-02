import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite numero 1: ");
        int numero1 = s.nextInt();

        System.out.println("digite numero 2: ");
        int numero2 = s.nextInt();

        int resultado;

        resultado = (numero1 + numero2);
        
        System.out.println("o resultado e: " + resultado);
        s.close();
    }
}
