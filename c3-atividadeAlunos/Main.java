public class Main {
    public static void main(String[] args) {
        ArrayList<Nota> notasAluno1 = new ArrayList<>();

        ArrayList<Nota> notasAluno2 = new ArrayList<>();

        ArrayList<Nota> notasAluno3 = new ArrayList<>();

        ArrayList<Nota> notasAluno4 = new ArrayList<>();

        for (Aluno aluno : new Aluno[]{aluno1, aluno2, aluno3, aluno4}) {
            double media = aluno.calcularMedia();
            if (media >= 7.0) {
                System.out.println(aluno.getNome() + " foi aprovado com média " + media);
            } else {
                System.out.println(aluno.getNome() + " foi reprovado com média " + media);
            }
        }
    }
}
