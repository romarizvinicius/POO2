import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        int index = 0;

        System.out.println("Digite valores inteiros para preencher o vetor (digite 0 para parar):");

        while (true) {
            try {
                int valor = scanner.nextInt();

                // Interrompe a entrada se o valor for 0
                if (valor == 0) {
                    if (index < 10) {
                        vetor[index] = valor;
                    }
                    break;
                }

                // Adiciona o valor ao vetor
                vetor[index] = valor;
                index++;

                // Verifica se o vetor está cheio
                if (index >= 10) {
                    System.out.println("O vetor está cheio.");
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Mais do que 10 valores foram informados.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor informado não é um número inteiro.");
                scanner.next(); // Limpa o scanner para evitar loop infinito
            }
        }

        scanner.close();

        System.out.println("Valores no vetor:");
        for (int i = 0; i < index; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
