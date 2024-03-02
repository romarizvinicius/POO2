import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = s.next();

        if (nome.length() > 5){
            System.out.println("seu nome contem mais de 5 caracteres");
        }else{
            System.out.println("seu nome contem menos de 5 caracteres");
        }
        s.close();
    }
}
