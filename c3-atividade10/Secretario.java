public class Secretario extends Funcionario {

    public Secretario(String nome, int inscricao, double salario, String turno) {
        //atributos da classe funcionario que serao utilizados pela classe secretario
        super(nome, inscricao, salario, turno);
       
    }

    //metodos exclusivos da classe secretario
    public void receberEncomendas(){
        System.out.println("receber encomendas");
    }
    
    public void receberPagamentos(){
        System.out.println("receber pagamentos");
    }

    // metodos da classe pai que vao ser usados na classe filha
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
        System.out.println("receber pessoas e auxiliar funcionarios");
    }
}
