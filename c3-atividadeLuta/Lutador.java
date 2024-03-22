public class Lutador {

    String nome;
    Double energia;
    int força;

    public Lutador(String nome, Double energia, int força) {
        this.nome = nome;
        this.energia = energia;
        this.força = força;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public void reduzirEnergia (){
    }

    public void aplicarGolpe (){
    }
}