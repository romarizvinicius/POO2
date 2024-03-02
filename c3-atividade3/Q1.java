import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String usuario = s.next();

        System.out.println("Boas vindas " + usuario);

        s.close();
    }
}