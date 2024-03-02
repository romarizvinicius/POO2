import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma sequencia de numeros separados por ( )");
        String sequencia = s.nextLine();

        String[] numeros = sequencia.split(" ");

        int quantidade = numeros.length;
        System.out.println("Foram digitados " + quantidade);
        s.close();
    }
    
}
