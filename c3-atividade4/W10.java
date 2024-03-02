import java.util.Scanner;

public class W10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] meses = {"janeiro" , "fevereiro" , "marco" , "abril" , "manio" , "junho" , "julho" , "agosto" , "setembro" , "outubro" , "novembro" , "dezembro"};
        
        System.out.println("digite o numero do mes");
        int numeroMes = s.nextInt();
        
        if (numeroMes >= 1 && numeroMes <= 12) {
            String nomeMes = meses[numeroMes - 1]; 
            System.out.println( numeroMes + " e: " + nomeMes);
        } else {
            System.out.println("invalido");
        }
        
        s.close();
    }
}
