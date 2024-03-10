import java.util.Scanner;

public class R4 {

    public static String funcao(int numero){
        if (numero > 0){
            return "1";
        }else if (numero < 0){
            return "0";
        }else {
            return "e o numero zero";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = s.nextInt();


        String resultado = funcao(numero);
        System.out.println(resultado);

        s.close();
    }
}
