import java.util.Scanner;
public class W11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o seu salario: ");
        double salario = s.nextDouble(); 

        double porcentagem;
        if (salario > 1500){
            porcentagem = 0.1;
        }else{
            porcentagem = 0.15;
        }

        double resultado = salario + (salario * porcentagem);
        System.out.println("o valor vai ser " + resultado);

        s.close();

    }
}
