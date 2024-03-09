import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite uma sequencia de numeros (0 quebra o loop)");
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        while ((numero = s.nextInt()) != 0) {
            maior = Math.max(maior, numero);
            menor = Math.min(menor, numero);
            System.out.println("o maior numero é" + maior);
            System.out.println("o menor numero é " + menor);
        }
        s.close();
    }
}
