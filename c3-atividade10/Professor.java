public class Professor extends Funcionario {// extends sinalisando que a classe professor e filha da classe funcionario
    private String disciplina;

    public Professor(String nome, int inscricao, double salario, String turno, String disciplina) {
        super(nome, inscricao, salario, turno);// super se refere aos atributos definidos na classe pai queno caso e a
                                               // classe funcionario
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void lecionar() {
        System.out.println("dar aula");
    }

    public void criarAtividade() {
        System.out.println("fazer atividade");
    }

    // metodos da classe pai que vao ser usados na classe filha
    @Override
    public void horariosDIsponiveis() {
        System.out.println("segunda a sexta de 9 as 18");
    }

    @Override
    public void horarioTrabalho() {
        System.out.println("de 8 ate 16");
    }

    @Override
    public void informacoesFuncionario() {
        System.out.println("nome " + getNome());
        System.out.println("inscriçao " + getInscricao());
        System.out.println("salario " + getSalario());
        System.out.println("turno " + getTurno());
    }

    public void funcaoDesempenhar() {
        System.out.println("ensinar");
    }

}
