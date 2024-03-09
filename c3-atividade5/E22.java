import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros (0 quebra o loop)");

        int numero;
        int media = 0;
        int quantidade = 0;

        while ((numero = s.nextInt()) != 0) {
            if (numero >= 50 || numero <= 100){
                media += numero;
                quantidade++;
            }
        }
        double medias = media/quantidade;
        System.out.println(medias);
        s.close();
    }
}
