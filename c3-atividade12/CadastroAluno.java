import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAluno {
    private List<Aluno> listaAlunos = new ArrayList<>();

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    public void addAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void imprimList(){
        for(Aluno aluno : listaAlunos){
            System.out.println(" matricula " + aluno.getMatricula() + " curso " + aluno.getCurso() + " idade " + aluno.getIdade() + " nome " + aluno.getNome());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CadastroAluno cadastroAluno = new CadastroAluno();

        for (int i = 0; i < 10; i++) {
            System.out.print("digite matricula ");
            int matricula = s.nextInt();
            s.nextLine(); 
            
            System.out.print("digite nome ");
            String nome = s.nextLine();

            System.out.print("digite idade ");
            int idade = s.nextInt();
            s.nextLine(); 

            System.out.print("digite curso ");
            String curso = s.nextLine();

            Aluno aluno = new Aluno(matricula, nome, idade, curso);
            cadastroAluno.addAluno(aluno);
        }
        cadastroAluno.imprimList();
        s.close();
    }
    
}
