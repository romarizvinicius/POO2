import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Lutador ryu = new Lutador("Ryu", 100, 10);

        Lutador bison = new Lutador("Bison", 100, 12);

        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }

        System.out.println("energia de bison dps dos golpes " + bison.energia);

        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);
        }

        System.out.println("energia de ryu dps dos golpes " + ryu.energia);

        s.close();
    }

}
