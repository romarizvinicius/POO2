import java.util.ArrayList;
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcular(){
        return Math.PI*Math.pow(raio,2);
    }

    public static void main(String[] args) {
        
        Circulo bola1 = new Circulo(4);
        Circulo bola2 = new Circulo(5);
        Circulo bola3 = new Circulo(6);
        Circulo bola4 = new Circulo(7);
        Circulo bola5 = new Circulo(8);

        ArrayList<Circulo> circulos = new ArrayList<>();
        circulos.add(bola1);
        circulos.add(bola2);
        circulos.add(bola3);
        circulos.add(bola4);
        circulos.add(bola5);

        //para percorrer o arraylist criado vamos usar um for para comparar se o tamanho do i e menor 
        //que o tamanho do arraylist toda vez que termina a verificaçao add +1 ate sair do laço
        for (int i = 0; i < circulos.size(); i++){
            Circulo bola = circulos.get(i);
            //ja que começa a contar no 0
            System.out.println("circulo " + (i + 1) + " = " + bola.calcular());
        }
    }
}
