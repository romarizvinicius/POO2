import java.util.Stack;

public class PilhaDeCaixas {
    private double alturaMaxima;
    private Stack<Caixa> pilha;

    public PilhaDeCaixas(double alturaMaxima, Stack<Caixa> pilha) {
        this.alturaMaxima = alturaMaxima;
        this.pilha = pilha;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        if (alturaMaxima > 0) {
            this.alturaMaxima = alturaMaxima;
        } else {
            System.out.println("deve ser um numero real maior que zero");
        }
    }

    public Stack<Caixa> getPilha() {
        return pilha;
    }

    public void setPilha(Stack<Caixa> pilha) {
        this.pilha = pilha;
    }

    public boolean empilhar(Caixa caixa) {
        double alturaAtual = calcularAltura();
        if (alturaAtual + caixa.getAltura() > alturaMaxima) {
            System.out.println("nao e possivel empilhar mais caixas limite de altura");
            return false;
        }
        
        for (Caixa c : pilha) {
            if (c instanceof CaixaFragil) {
                CaixaFragil caixaFragil = (CaixaFragil) c;
                if (alturaAtual + caixa.getAltura() > caixaFragil.getPesoMaximoSuportado()) {
                    System.out.println("nao e possivel empilhar mais caixas peso limite");
                    return false;
                }
            }
        }

        pilha.push(caixa);
        return true;
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        } else {
            System.out.println("a pilha esta vazia");
            return null;
        }
    }

    public double calcularAltura() {
        double alturaAtual = 0;
        for (Caixa caixa : pilha) {
            alturaAtual += caixa.getAltura();
        }
        return alturaAtual;
    }

    public double calcularPeso() {
        double pesoTotalAtual = 0;
        for (Caixa caixa : pilha) {
            pesoTotalAtual += caixa.getPeso();
        }
        return pesoTotalAtual;
    }

    public void exibirDadosCaixasEmpilhadas() {
        System.out.println("caixas empilhadas:");
        for (Caixa caixa : pilha) {
            caixa.exibirEtiqueta();
            System.out.println();
        }

        System.out.println("altura da pilha: " + calcularAltura() + " cm");
        System.out.println("peso da pilha: " + calcularPeso() + " kg");
    }
}

