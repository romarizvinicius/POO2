import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma sequencia de numeros (digitar -1 para o loop)");
        
        int numero;
        int soma = 0;
        int quantidade = 0;
        
        while ((numero = s.nextInt()) != -1) {
            soma += numero;
            quantidade++;
            double media = (double) soma / quantidade;
            System.out.println("a media dos numeros digitados e: " + media);
        }
        s.close();
    }
}
