import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, int anoDePublicaçao, int numeroDeCopiasDisponiveis, LocalDate devolucaoDate,
            String autor) {
        super(titulo, anoDePublicaçao, numeroDeCopiasDisponiveis, devolucaoDate);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double calcular_multa(){
        LocalDate dataAtual = LocalDate.now();
        long diasAtraso = ChronoUnit.DAYS.between(getDevolucaoDate(), dataAtual);
        if (diasAtraso > 0) {
            return 0.5 * diasAtraso;
        }
        return 0;
    }
}
