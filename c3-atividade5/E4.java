import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a altura " + i + " " );
            double altura = s.nextDouble();
            soma += altura;
        }
        double media = soma / 5;

        System.out.println("a media da altura das 5 pessoas é " + media);
        s.close();
    }
}
