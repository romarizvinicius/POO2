import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = s.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = s.nextInt();

        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        int diferenca = numero1 - numero2;
        System.out.println("Diferença: " + diferenca);

        int produto = numero1 * numero2;
        System.out.println("Produto: " + produto);

        int quociente = numero1 / numero2;
        System.out.println("Quociente: " + quociente);

        s.close();
    }
}
