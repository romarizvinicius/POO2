
public class CaixaFragil extends Caixa {
    private double pesoMaximoSuportado;

    public CaixaFragil(int identificador, String conteudo, double peso, double altura, double pesoMaximoSuportado) {
        super(identificador, conteudo, peso, altura);
        this.pesoMaximoSuportado = pesoMaximoSuportado;
    }

    public double getPesoMaximoSuportado() {
        return pesoMaximoSuportado;
    }

    public void setPesoMaximoSuportado(double pesoMaximoSuportado) {
        if (pesoMaximoSuportado > 0){
        this.pesoMaximoSuportado = pesoMaximoSuportado;
        }else{
            System.out.println("deve ser um numero real maior que zero");
        }
}

@Override
public void exibirEtiqueta(){
    super.exibirEtiqueta();
    System.out.println("peso maximo suportado:" + pesoMaximoSuportado + " km ");
}
//1-utilizamos herança ao usar o extends na classe caixa e caixa fragil.

//2-aplicamos polimorfismo ao utilizarmos exibiretiqueta metodo criado na classe caixa mas usado nas outras classes
}
