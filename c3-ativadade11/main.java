import java.util.Stack;

public class main {
    public static void main (String[] args) {
        Caixa caixa1 = new Caixa(1, "Livros", 5.0, 20.0);
        CaixaFragil caixa2 = new CaixaFragil(2, "Vidros", 3.0, 15.0, 10.0);
        Caixa caixa3 = new Caixa(3, "Roupas", 7.0, 25.0);
        CaixaFragil caixa4 = new CaixaFragil(4, "Eletrônicos", 2.0, 10.0, 5.0);

        PilhaDeCaixas pilhaDeCaixas = new PilhaDeCaixas(20.0, new Stack<>());

        pilhaDeCaixas.empilhar(caixa1);
        pilhaDeCaixas.empilhar(caixa2);
        pilhaDeCaixas.empilhar(caixa3);
        pilhaDeCaixas.empilhar(caixa4);

        pilhaDeCaixas.exibirDadosCaixasEmpilhadas();

        Caixa caixaDesempilhada = pilhaDeCaixas.desempilhar();
        if (caixaDesempilhada != null) {
            System.out.println("Caixa desempilhada:");
            caixaDesempilhada.exibirEtiqueta();
        }
    }
}

