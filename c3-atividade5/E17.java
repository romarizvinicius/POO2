import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros(0 quebra o loop)");
        int numero;
        int pares = 0;
        
        while ((numero = s.nextInt()) != 0) {
            if (numero % 2 == 0) {
                pares++;
            }
        }
        
        System.out.println(pares + " numeros pares antes de um impar ");
        s.close();
}
}
