import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Aluno aluno = new Aluno ("pedro ", "76432");

        aluno.notas[0] = 4;
        aluno.notas[1] = 7;
        aluno.notas[2] = 9;
        aluno.notas[3] = 6;

        double media = aluno.calcularMedia();
        System.out.println("Media do aluno e " + media);

        aluno.notas[1] = 10;

        media = aluno.calcularMedia();
        System.out.println("a nova media e " + media);


        s.close();
    }

}
