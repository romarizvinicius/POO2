import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite a base do retangulo: ");
        int base = s.nextInt();

        System.out.println("digite a altura do retangulo: ");
        int altura = s.nextInt();

        int area = (base * altura);

        System.out.println("o area do retangulo é igual a " + area);
        s.close();
    }
    
}
