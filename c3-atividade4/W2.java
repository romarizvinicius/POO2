import java.util.Scanner;

public class W2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int idade = s.nextInt();

        if (idade >= 18){
            System.out.println("é maior de idade");
        }else{
            System.out.println("é menor de idade");
        }
        s.close();
    }
}
