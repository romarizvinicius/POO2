import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("escreva um numero: ");
        int numero = s.nextInt();

        if (numero < 0){
            System.out.println("o numero e negativo");
        }else if(numero > 0){
            System.out.println("o numero e positivo");
        }else{
            System.out.println("onumero e igual a zero");
        }
        s.close();
    }
}