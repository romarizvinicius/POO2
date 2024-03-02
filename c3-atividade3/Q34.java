import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         System.out.println("Digite o primeiro número:");
         double numero1 = s.nextDouble();
 
         System.out.println("Digite o segundo número:");
         double numero2 = s.nextDouble();
 
         System.out.println("Digite o terceiro número:");
         double numero3 = s.nextDouble();
 
         double media = (numero1 + numero2 + numero3) / 3;
 
         System.out.println("A média aritmética dos números é: " + media);
 
         s.close();
    }
}
