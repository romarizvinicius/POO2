import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = s.nextInt();

        if(numero % 2 == 0){
            System.out.println("o numero e par");
        }else{
            System.out.println("o numero e impar");
        }

        s.close();
    }
    
}
