import java.util.Scanner;
public class W18{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero1 = s.nextInt();

        System.out.println("digite outro numero");
        int numero2 = s.nextInt();

        
        System.out.println("escolha a operacao");
        System.out.println("soma 1");
        System.out.println("subtracao 2");
        System.out.println("mutiplicacao 3");
        System.out.println("divisao 4");
        int operacao = s.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da subtracao: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicacao: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Resultado da divisao: " + ((double) numero1 / numero2));
                break;
            default:
                break;
        }
    s.close();
    }
}