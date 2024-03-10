import java.util.Scanner;

public class R2 {

    public static int funcao(int numero){
        int dobro = numero * 2;
        return dobro;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o numero para sair o dobro dele ");
        int numero = s.nextInt();

        int dobro = funcao(numero);
        System.out.println(dobro);

        s.close();
    }
}
