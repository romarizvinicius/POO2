import java.util.Scanner;
public class W16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite sua idade");
        int idade = s.nextInt();

        if (idade <= 1){
            System.out.println("é um bebe");
        }else if (idade >= 2 && idade <= 12){
            System.out.println("é uma criança");
        }else if (idade >=13 && idade <= 18){
            System.out.println("é um adolescente");
        }else{
            System.out.println("é um adulto");
        }
        s.close();
    }
}
