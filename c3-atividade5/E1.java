import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alunos = 5;
        double[] notas = new double[alunos];
        int alunosPassados = 0;

        System.out.println("digite as notas dos " + alunos + "alunos");

        for (int i = 0; i < alunos; i++){
            System.out.println("nota do aluno " + (i+1));
            notas[i] = s.nextDouble();
        }

        for (int i = 0; i < alunos; i++){
            if (notas[i] >= 7){
                alunosPassados++;
            }
        }
        System.out.println("quantidade de alunos aprovadoe e: " + alunosPassados);
        s.close();
    }
    }
