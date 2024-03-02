import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um produto ");
        String produtro = s.next();

        System.out.println("digite o preço do produto ");
        String preco = s.next();

        System.out.println("o preço do " + produtro + "e´ : R$" + preco);
        s.close();
    }
}
