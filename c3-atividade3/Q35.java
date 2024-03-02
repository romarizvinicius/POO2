import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
    
        int meses = idade * 12;
        int dias = idade * 365;
        System.out.println("Você viveu" + meses + " meses e " + dias + " dias");
        s.close();
    }    
    
}
