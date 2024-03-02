import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero1 = s.nextInt();

        System.out.println("digite outro numero: ");
        int numero2 = s.nextInt();
        
        if (numero1 > numero2){
            System.out.println(numero1);
        }else{
            System.out.println(numero2);
        }
        s.close();
    }
    
}
