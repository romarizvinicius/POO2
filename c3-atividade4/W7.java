import java.util.Scanner;

public class W7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite uma letra");
        char letra = s.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("a letra e uma vogal");
        }else{
            System.out.println("a letra e uma cossoante");
        }
        s.close();
    }
}
