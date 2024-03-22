public class Aluno {

    String nome;
    String CPF;
    double[] notas = new double[4];

    public Aluno(String nome, String cPF) {
        this.nome = nome;
        CPF = cPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
           return soma = soma / notas.length;
    }

}
