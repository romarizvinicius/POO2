import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 9;
        int tabuada = 0;
        int mutiplicacao = 0;

        while(tabuada <= 10){
            mutiplicacao = numero * tabuada;
            System.out.println(numero + " * " + tabuada + " = " + mutiplicacao);
            tabuada ++;
        }
        s.close();
    }
}
