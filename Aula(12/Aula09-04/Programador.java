public class Programador extends Funcionario0 {

    @Override
    public double calcularBonificacao() {
        double bonificacao = super.calcularBonificacao();
        bonificacao += 1000;

        return bonificacao;
    }

}
