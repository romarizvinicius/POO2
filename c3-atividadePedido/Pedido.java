import java.util.ArrayList;

public class Pedido {
    private double numero;
    private ArrayList<ItemPedido> itens;
    private double total;

    public Pedido(double numero, ArrayList<ItemPedido> itens, double total) {
        this.numero = numero;
        this.itens = itens;
        this.total = total;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        this.total = total;
    }
}
