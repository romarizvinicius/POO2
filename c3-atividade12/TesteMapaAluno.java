import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();

        Aluno aluno1 = new Aluno(9, "henri", 25, "cdc");
        Aluno aluno2 = new Aluno(8, "fred", 24, "med");
        Aluno aluno3 = new Aluno(6, "jorje", 23, "adm");
        Aluno aluno4 = new Aluno(7, "lola", 22, "eng");
        Aluno aluno5 = new Aluno(5, "let", 21, "bio");

        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        mapaAlunos.put(aluno5.getMatricula(), aluno5);

        System.out.println("digite a matricula do aluno ");
        int matricula = s.nextInt();

        Aluno alunoPro = mapaAlunos.get(matricula);
        if (alunoPro != null) {
            System.out.println("matricula " + alunoPro.getMatricula());
            System.out.println("nome " + alunoPro.getNome());
            System.out.println("idade " + alunoPro.getIdade());
            System.out.println("curso " + alunoPro.getCurso());
        } else {
            System.out.println("Aluno não encontrado!");
        }

        s.close();
    }
}
