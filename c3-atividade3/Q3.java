import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite um numero inteiro: ");
        int numero = s.nextInt();

        Float numerFloat = (float)numero;

        System.out.println(" numero = " + numerFloat);
        s.close();

    }
}
