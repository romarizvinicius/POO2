import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        LocalDate dataDevolucaoPrevista = LocalDate.now().plusDays(7);

        Livro livro = new Livro("a dama de preto", 2009, 5, dataDevolucaoPrevista, "george");
        DVD dvd = new DVD("a maeia noite", 2015, 5, dataDevolucaoPrevista, 3);
        Revista revista = new Revista("o sonho", 2003, 5, dataDevolucaoPrevista, 4);

        System.out.println("emprestimo");
        livro.emprestar();
        dvd.emprestar();
        revista.emprestar();

        System.out.println("devolutiva");
        livro.devolver();
        dvd.devolver();
        revista.devolver();

        s.close();
    }
}
