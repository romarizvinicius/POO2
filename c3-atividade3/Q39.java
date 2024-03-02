import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite a temperatura em celsius: ");
        double temperaturaC = s.nextDouble();

        double temperaturaF = (temperaturaC * 9 / 5) + 32;

        System.out.println("A temperatura e: " + temperaturaF);
        s.close();
    }
    
}
