import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int numero1 = s.nextInt();

        System.out.println("digite o segundo numero: ");
        int numero2 = s.nextInt();

        System.out.println("digite o terceiro numero: ");
        int numero3 = s.nextInt();

        int resultado = (numero1 + numero2) * numero3;

        System.out.println("O resultado da operação e: " + resultado);
        s.close();

    }
}
