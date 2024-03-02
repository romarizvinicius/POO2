import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = s.nextInt();
        
        String resultado = numero + " ";

        System.out.println("Resultado da concatenação: " + resultado);
        s.close();
    }
}
