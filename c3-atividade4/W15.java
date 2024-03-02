import java.util.Scanner;

public class W15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite um numero de 1 a 7");
        int numero = s.nextInt();

        switch (numero) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3: 
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                break;
        }
        
        s.close();
    }
}
