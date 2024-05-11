import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ItemBiblioteca {
    private String titulo;
    private int anoDePublicaçao;
    private int numeroDeCopiasDisponiveis;
    private LocalDate devolucaoDate;

    public ItemBiblioteca(String titulo, int anoDePublicaçao, int numeroDeCopiasDisponiveis, LocalDate devolucaoDate) {
        this.titulo = titulo;
        this.anoDePublicaçao = anoDePublicaçao;
        this.numeroDeCopiasDisponiveis = numeroDeCopiasDisponiveis;
        this.devolucaoDate = devolucaoDate;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDePublicaçao() {
        return anoDePublicaçao;
    }

    public void setAnoDePublicaçao(int anoDePublicaçao) {
        this.anoDePublicaçao = anoDePublicaçao;
    }

    public int getNumeroDeCopiasDisponiveis() {
        return numeroDeCopiasDisponiveis;
    }

    public void setNumeroDeCopiasDisponiveis(int numeroDeCopiasDisponiveis) {
        this.numeroDeCopiasDisponiveis = numeroDeCopiasDisponiveis;
    }

    public LocalDate getDevolucaoDate() {
        return devolucaoDate;
    }

    public void setDevolucaoDate(LocalDate devolucaoDate) {
        this.devolucaoDate = devolucaoDate;
    }

    public double calcular_multa() {
        LocalDate dataAtual = LocalDate.now();
        long diasAtraso = ChronoUnit.DAYS.between(devolucaoDate, dataAtual);
        if (diasAtraso > 0) {
            return 0.5 * diasAtraso;
        }
        return 0;
    }

    public void emprestar() {
        if (numeroDeCopiasDisponiveis > 0) {
            numeroDeCopiasDisponiveis--;
            System.out.println("emprestado");
        } else {
            System.out.println("nao tem copias disponiveis");
        }
    }

    public void devolver() {
        numeroDeCopiasDisponiveis++;
        System.out.println("devolvido");

        double multa = calcular_multa();
        if (multa > 0) {
            System.out.println("multa por atraso: " + multa);
        }
    }
}