import java.util.Scanner;;

public class W14SwitchBreak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("insira um numero inteiro de 1 a 5:");
        int numero = s.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Muito insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Muito bom");
                break;
            default:
                break;
        }

        s.close();
    }
}
