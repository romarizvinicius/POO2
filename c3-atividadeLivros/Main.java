import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        for (Livro livro : livros) {
            System.out.println(livro.verificarDisponibilidade());
        }
    }
}
