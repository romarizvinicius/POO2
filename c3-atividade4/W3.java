import java.util.Scanner;

public class W3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero1 = s.nextInt();

        System.out.println("digite outro numero");
        int numero2 = s.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1 + " é maior que " + numero2);
        }else if (numero1 < numero2){
            System.out.println(numero1 + " é menor que " + numero2);
        }else{
            System.out.println("os numeros sao iguais100");
        }
        s.close();
    }
}
