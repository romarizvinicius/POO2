import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o numero da sua cidade: ");
        String cidade = s.next();

        char letra = 's';

        if (cidade.length() > 0 && cidade.charAt(0) == letra){
            System.out.println("O nome da sua cidade começa com a letra: " + letra);
        }else{
            System.out.println("O nome da sua cidade nao começa com a letra: " + letra);
        }
        s.close();
    }
    
}
