import java.util.Scanner;

public class W5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        double nota1 = s.nextDouble();

        System.out.println("digite a segunda nota: ");
        double nota2 = s.nextDouble();

        System.out.println("digite a terceira nota: ");
        double nota3 = s.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3);
        System.out.println("a media é " + media);

        if (media >= 7){
            System.out.println("o aluno esta aprovado");
        }else{ 
            System.out.println("o aluno esta reprovado");
        }
        s.close();
    }
}
