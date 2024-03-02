import java.util.Scanner;

public class W6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o nome de uma pessoa");
        String nome1 = s.nextLine();

        System.out.println("digite outro nome");
        String nome2 = s.nextLine();

        if (nome1.length() > nome2.length()){
            System.out.println(nome1);
        }else{
            System.out.println(nome2);
        }

        s.close();
    }
}
