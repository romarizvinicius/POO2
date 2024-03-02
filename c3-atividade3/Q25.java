import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu ano de nascimento");
        int ano = s.nextInt();

        System.out.println("Bem vindo ao nosso programa, nascido em " + ano);
        s.close();
    }
}
