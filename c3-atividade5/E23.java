import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma sequencia de numeros (0 o loop sai)");

        int numero;
        int auxilio = Integer.MIN_VALUE;

        while ((numero = s.nextInt()) != 0) {
            if (numero > 0 && numero % 2 != 0){
                auxilio = numero;
            }
            
        }
        System.out.println("o menor numero é " + auxilio);
        s.close();
    }
}
