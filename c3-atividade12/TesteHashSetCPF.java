import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSetCPF {
    
    public static void main(String[] args) {
        
        HashSet<String> CPF = new HashSet<String>();

        Scanner s = new Scanner(System.in);

        System.out.println("digite 10 cpf");
        for (int i = 0;i < 10; i++){
            String cpf = s.nextLine();
            CPF.add(cpf);
        }

        for (String cpf : CPF){
            System.out.println("CPF " + cpf);
        }

        s.close();
    }

}
