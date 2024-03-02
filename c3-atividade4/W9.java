import java.util.Scanner;

public class W9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o peso");
        double peso = s.nextDouble();
        
        System.out.println("Digite a altura");
        double altura = s.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC é: " + imc);
   
        if (imc < 18.5) {
            System.out.println("pessoa esta abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("pessoa esta com peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("pessoa esta com sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("pessoa esta obesa");
        } else {
            System.out.println("pessoa esta muito obesa");
        }
        
        s.close();
    }
}