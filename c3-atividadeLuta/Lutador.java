public class Lutador {

    String nome;
    int energia;
    int força;

    public Lutador(String nome, int energia, int força) {
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

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public void reduzirEnergia (int força2){
        energia -= força2;

        if (energia < 0){
            energia = 0;
        }

    }

    public void aplicarGolpe (Lutador inimigo){
        inimigo.reduzirEnergia(força);
        System.out.println(nome + "golpeou " + inimigo.nome);
        System.out.println(inimigo.energia + "teve sua energia reduzida para " + inimigo.energia);
    }
}