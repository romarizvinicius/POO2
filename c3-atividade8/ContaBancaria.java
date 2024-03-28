
public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;

    public ContaBancaria(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String renan) {
        this.nome = renan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int novonumero) {
        this.numero = novonumero;
        novonumero = 90004;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novosaldo) {
        this.saldo = novosaldo;
        novosaldo = 99.0;
    }

}
