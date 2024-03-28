
public class Carro {
    private String marca;
    private String modelo;
    private int fabricacao;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int fabricacao, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(int fabricacao) {
        this.fabricacao = fabricacao;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int mais){
        if (mais > 0){
            velocidadeAtual = velocidadeAtual + mais;
        }
    }

    public void desacelerar(int menos){
        if (menos > 0){
            velocidadeAtual = velocidadeAtual - menos;
        }
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

}
