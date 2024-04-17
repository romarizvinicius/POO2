public class Coordenador extends Funcionario{

    public Coordenador(String nome, int inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
    }

    public void auxiliarProfessores(){
        System.out.println("auxilia os professores com os estudantes");
    }

    public void organizarFestivais(){
        System.out.println("organiza festividades na escola");
    }
    
    @Override
    public void horariosDIsponiveis() {
        System.out.println("segunda a sexta de 7 as 16");
    }

    @Override
    public void horarioTrabalho() {
        System.out.println("de 7 ate 15");
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
        System.out.println("auxilia os professores e organiza festividades");
    }
}
