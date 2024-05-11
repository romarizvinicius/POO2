import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista(String titulo, int anoDePublicaçao, int numeroDeCopiasDisponiveis, LocalDate devolucaoDate,
            int edicao) {
        super(titulo, anoDePublicaçao, numeroDeCopiasDisponiveis, devolucaoDate);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
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
