import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu email");
        String email = s.nextLine();

        System.err.println("bem vindo " + email);
        s.close();
    }
}
