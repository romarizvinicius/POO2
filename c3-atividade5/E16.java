import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite a nota dos 5 alunos");
        int alunos = 0;
        int notas = 0;
        while (notas < 5){
            double nota = s.nextDouble();
            notas++;
            if (nota >= 7){
                alunos++;
            }

        }

        System.out.println("o numero de alunos aprovados e " + alunos);
        s.close();
    }
}
