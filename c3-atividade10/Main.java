import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //add os trabalhadores
        funcionarios.add(new Professor("vinicius", 1, 2000, "manah", "Matemática"));
        funcionarios.add(new Secretario("matheus", 2, 3000, "tarde"));
        funcionarios.add(new Diretor("fernanda", 3, 4000, "manha", "tarde"));
        funcionarios.add(new Coordenador("fernando", 4, 5000, "manha"));

        // imprime a lista 
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Inscrição: " + funcionario.getInscricao());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Turno: " + funcionario.getTurno());
            funcionario.horariosDIsponiveis();
            funcionario.horarioTrabalho();
            funcionario.informacoesFuncionario();
            funcionario.funcaoDesempenhar();
            System.out.println();
        }
    }
}
