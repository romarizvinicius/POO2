public class Diretor extends Funcionario{
    private String segTurno;

    public Diretor(String nome, int inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }

    public String isSegTurno() {
        return segTurno;
    }

    public void setSegTurno(String segTurno) {
        this.segTurno = segTurno;
    }

    public void criarDescontos(){
        System.out.println("cria desconto");
    }

    public void encomendarFardas(){
        System.out.println("encomenda fardas");
    }

    public void gerenciarProfessores(){
        System.out.println("gerencia os horarios dos professores");
    }

    @Override
    public void horariosDIsponiveis() {
        System.out.println("segunda a sexta de 7 as 16");
    }

    @Override
    public void horarioTrabalho() {
        System.out.println("de 9 ate 17");
    }

    @Override
    public void informacoesFuncionario() {
        System.out.println("nome " + getNome());
        System.out.println("inscriçao " + getInscricao());
        System.out.println("salario " + getSalario());
        System.out.println("turno " + getTurno());
    }

    @Override
    public void funcaoDesempenhar() {
        System.out.println("gerencia os professores e funcionarios");
    }
}