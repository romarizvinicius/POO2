import java.util.ArrayList;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>(10);

        System.out.println("Digite a idade de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        System.out.println("Idades armazenadas: " + idades);
        System.out.print("Digite a posição da idade a ser removida: ");
        int posicao = scanner.nextInt();

        try {
            int idadeRemovida = idades.remove(posicao);
            System.out.println("A idade " + idadeRemovida + " na posição " + posicao + " foi removida.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        }
        System.out.println("Idades restantes: " + idades);

        scanner.close();
    }
}

