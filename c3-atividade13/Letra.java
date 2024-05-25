import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número: ");
        int posicao = scanner.nextInt();

        try {
            char letra = nome.charAt(posicao);
            System.out.println("A letra na posição " + posicao + " é: " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        }

        scanner.close();
    }
}
