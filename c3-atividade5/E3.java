import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = s.nextInt();

        System.out.println("divisores de " + numero);
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                System.out.println(i);
            }
        }
        
        s.close();
    }
}
