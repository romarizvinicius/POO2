import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("digite sua idade: ");
        String idade = s.next();

        System.out.println("sua idade é : " + idade);
        s.close();
    }

}
