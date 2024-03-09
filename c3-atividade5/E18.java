import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros ");
        int numero;
        int pares = 0;
        int impares = 0;

        while ((numero = s.nextInt()) != 0) {
            if (numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            
        }
        System.out.println("pares " + pares);
        System.out.println("impares " + impares);
        s.close();
    }
}
