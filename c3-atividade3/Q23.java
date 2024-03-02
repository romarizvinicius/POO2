import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a data no formato 'dd/mm/aaaa':");
        String dataString = s.nextLine();
        
        String[] partes = dataString.split("/");
        
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
            

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
        s.close();
    }
}
