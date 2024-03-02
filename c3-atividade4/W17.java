import java.util.Scanner;
public class W17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite seu estado civil ");
        String estado = s.nextLine();

        switch (estado) {
            case "solteiro":
                System.err.println("voce e solteiro");
                break;
            case "casado":
                System.out.println("voce e casado");
                break;
            case "divorciado":
                System.out.println("voce e divorciado");
                break;
            case "viuvo":
                System.out.println("voce e viuvo");
                break;
            default:
                break;
        }
        s.close();
    }
}
