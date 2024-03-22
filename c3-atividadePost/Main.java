import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Post post = new Post ("carnaval ", "https://br.pinterest.com/");

        for (int i = 0; i < 3; i++ ){
            post.curtir();
        }

        for (int i = 0; i < 2; i++){
            post.compartilhar();
        }

        System.out.println("o numero de compartilhamentos e " + post.numeroDeCompartilhamentos);
        s.close();
    }
}
