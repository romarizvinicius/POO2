import java.util.Scanner;
public class R1 {

    public static double cForF(double tempC){
        double tempF = tempC * (9/5) + 32;
        return tempF;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite a temperatura em celsius");
        double tempC = s.nextDouble();

        double tempF = cForF(tempC);
        System.out.println(tempC + " graus celsius é equivalente a " + tempF + " graus fahrenheit");

        s.close();
    }
}