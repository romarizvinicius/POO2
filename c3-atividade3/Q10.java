import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("escreva o seu nome: ");
        String nome = s.next();

        System.out.println("digite o seu sobrenome: ");
        String sobrenome = s.next();

        System.out.println(sobrenome + " " + nome);
        s.close();
    }
}
