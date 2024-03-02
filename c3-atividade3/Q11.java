import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma String: ");
        String digite = s.next();

        int tamanho = digite.length();

        System.out.println("Otamanho da string é: " + tamanho);
        s.close();


    }
}
