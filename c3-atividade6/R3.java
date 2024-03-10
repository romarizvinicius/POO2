import java.util.Scanner;

public class R3 {

    public static String data(int dia, int mes, int ano) {
        String[] nomes= {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho","Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String nome = nomes[mes - 1];
        return dia + " / " + nome+ " / " + ano;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite o dia");
        int dia = s.nextInt();
        System.out.println("digite o mes");
        int mes = s.nextInt();
        System.out.println("digite o ano");
        int ano = s.nextInt();

        String data = data(dia, mes, ano);
        System.out.println( dia + "/" + mes + "/" + ano);
        System.out.println(data);
        s.close();
    }
}