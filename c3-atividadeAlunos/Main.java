import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Nota> notasAluno1 = new ArrayList<>();
        notasAluno1.add(new Nota(8.5));
        notasAluno1.add(new Nota(7.0));

        ArrayList<Nota> notasAluno2 = new ArrayList<>();
        notasAluno2.add(new Nota(6.5));
        notasAluno2.add(new Nota(5.0));

        ArrayList<Nota> notasAluno3 = new ArrayList<>();
        notasAluno3.add(new Nota(9.0));
        notasAluno3.add(new Nota(8.0));

        ArrayList<Nota> notasAluno4 = new ArrayList<>();
        notasAluno4.add(new Nota(4.0));
        notasAluno4.add(new Nota(3.5));

        Alunos aluno1 = new Alunos("João", 123, notasAluno1);
        Alunos aluno2 = new Alunos("Maria", 456, notasAluno2);
        Alunos aluno3 = new Alunos("Pedro", 789, notasAluno3);
        Alunos aluno4 = new Alunos("Ana", 101, notasAluno4);

        for (Alunos aluno : new Alunos[]{aluno1, aluno2, aluno3, aluno4}) {
            double media = aluno.calcularMedia();
            if (media >= 7.0) {
                System.out.println(aluno.getNome() + " foi aprovado com média " + media);
            } else {
                System.out.println(aluno.getNome() + " foi reprovado com média " + media);
            }
        }
    }
}
