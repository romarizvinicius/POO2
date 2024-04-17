import java.util.ArrayList;

public class Alunos {
    private String nome;
    private int matricula;
    private ArrayList<Nota> notas;

    public Alunos(String nome, int matricula, ArrayList<Nota> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.getValor();
        }
        return soma / notas.size();
    }
}
