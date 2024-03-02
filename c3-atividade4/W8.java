import java.util.Scanner;

public class W8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero1 = s.nextInt();

        System.out.println("digite outro numero");
        int numero2 = s.nextInt();

        System.out.println("digite o ulrimo numero");
        int numero3 = s.nextInt();

        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.print(numero1 + " ");
            if (numero2 <= numero3) {
                System.out.print(numero2 + " " + numero3);
            } else {
                System.out.print(numero3 + " " + numero2);
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.print(numero2 + " ");
            if (numero1 <= numero3) {
                System.out.print(numero1 + " " + numero3);
            } else {
                System.out.print(numero3 + " " + numero1);
            }
        } else {
            System.out.print(numero3 + " ");
            if (numero1 <= numero2) {
                System.out.print(numero1 + " " + numero2);
            } else {
                System.out.print(numero2 + " " + numero1);
            }
        }
        
        s.close();
    }
}
