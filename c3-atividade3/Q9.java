import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o nome de um animal: ");
        String nome = s.next();

        System.out.println("o animal digitado foi: " + nome);
        s.close();
    }
    
}
