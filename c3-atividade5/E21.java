import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma sequencia de numeros (0 quebra o loop)");
        int numero;
        int digitos = 0;

        while ((numero = s.nextInt()) != 0 ){
            if (numero >= 1000){
                digitos++;
            }
        }
        System.out.println(digitos + "numeros com mais de 3 digitos");
        s.close();
    }
}
