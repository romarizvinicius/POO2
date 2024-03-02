import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu ano de nascimento :");
        int nascimento = s.nextInt();
        int ano = 2024;

        int resultado = (ano - nascimento);
        System.out.println("a sua idade é: " + resultado);
        s.close();
    }
    
}
