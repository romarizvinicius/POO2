import java.util.Scanner;
public class W12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero ");
        int numero = s.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0 ){
            System.out.println("o numero e divisel por 3 e 5");
        }else{
            System.out.println("o numero nao e divisel por 3 e 5");
        }
        s.close();
    }
}
