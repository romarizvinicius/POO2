import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float numero = s.nextFloat();
        float resultado;

        resultado = (numero * numero);

        System.out.println("O resultado do quadrado do numero é " + resultado);
        s.close();
    }
}
