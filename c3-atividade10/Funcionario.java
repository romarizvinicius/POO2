public class Funcionario {
    private String nome;
    private int inscricao;
    private double salario;
    private String turno;

    public Funcionario(String nome, int inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    //aplicar polimorfismo nas subclasses
    public void horariosDIsponiveis(){
    }

    public void horarioTrabalho(){
    }

    public void informacoesFuncionario(){
    }

    public void funcaoDesempenhar(){
    }

}