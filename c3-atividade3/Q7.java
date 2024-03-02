import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu primeiro nome: ");
        String nome = s.next();

        System.out.println("digite seu sobrenome nome: ");
        String sobrenome = s.next();

        String resultado = (nome + sobrenome);

        System.out.println("seu nome e sobrenome sao :" + resultado);
        s.close();
    }    
}
