import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o nome da cidade: ");
        String cidade = s.next();

        System.out.println("digite o nome do estado: ");
        String estado = s.next();

        System.out.println("Voce mora em " + cidade + ", " + estado);
        s.close();
    }
}
