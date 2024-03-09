import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite uma sequencia de numeros (0 quebra o loop)");
        int numero;
        int divisiveis2 = 0;
        int divisiveis3 = 0;
        int divisiveis5 = 0;

        while ((numero = s.nextInt()) != 0) {
            if (numero % 2 == 0){
                divisiveis2++;
            }else if (numero % 3 == 0){
                divisiveis3++;
            }else if (numero % 5==0){
                divisiveis5++;
            }else{
                System.out.println("nao e nenhum dos de cima");
            }
            
        }
        System.out.println("divisiveis por 2 " + divisiveis2);
        System.out.println("divisiveis por 3 " + divisiveis3);
        System.out.println("divisiveis por 5 " + divisiveis5);
        s.close();
    }
}
