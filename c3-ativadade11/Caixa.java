
public class Caixa {
    private int identificador;
    private String conteudo;
    private double peso;
    private double altura;

    public Caixa(int identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("deve ser um numero real maior que zero");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("deve ser um numero real maior que zero");
        }
    }

    public void exibirEtiqueta(){
        System.out.println("identificador: " + identificador);
        System.out.println("conteudo: " + conteudo);
        System.out.println("peso: " + peso + " kg");
        System.out.println("altura: " + altura + " cm");
    }
}
