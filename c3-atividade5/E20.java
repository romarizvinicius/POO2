import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros (0 quebra o loop)");
        int numero;
        int soma = 0;
        int quantidade = 0;

        while ((numero = s.nextInt()) != 0) {
            if (numero % 3 == 0) {
                soma += numero;
                quantidade++;

            }
        }
        double media = (double) soma / quantidade;
        System.out.println("A média dos números divisíveis por 3 é: " + media);

        s.close();
    }
}
