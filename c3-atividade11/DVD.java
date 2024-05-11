import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DVD extends ItemBiblioteca {
    private double duracao;//minutos

    public DVD(String titulo, int anoDePublicaçao, int numeroDeCopiasDisponiveis, LocalDate devolucaoDate,
            double duracao) {
        super(titulo, anoDePublicaçao, numeroDeCopiasDisponiveis, devolucaoDate);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
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
