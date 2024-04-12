public abstract class Funcionario0 {
    private String nome;
    private String cpf;
    private double salario;

    public double calcularBonificacao() {
        double bonificacao = this.salario * 0.1;

        return bonificacao;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}