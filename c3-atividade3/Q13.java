import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int numero = s.nextInt();

        if (numero > 0){
            System.out.println("o numero e positivo");
        }else if(numero < 0){
            System.out.println("numero e negativo");
        }else{
            System.out.println("o numero e zesro");
        }
        s.close();
    }
    
}
