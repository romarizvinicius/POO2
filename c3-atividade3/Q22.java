import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite um numero: ");
        String numero = s.next();

        int numer = Integer.parseInt(numero);

        numer += 10;

        String resultado = Integer.toString(numer);

        System.out.println("o numero apos adicionar 10 é: " + resultado);
        s.close();
    }
}