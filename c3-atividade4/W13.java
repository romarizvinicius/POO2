import java.util.Scanner;
public class W13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("escreva o dia da semana ");
        String semana = s.nextLine();

        if(semana.equals("sabado") || semana.equals("domingo")){
            System.out.println("o dia e fim de semana");
        }else{
            System.out.println("é dia ultil");
        }
        s.close();
    }
}
