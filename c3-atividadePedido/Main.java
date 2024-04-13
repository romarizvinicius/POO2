import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        int contagemPedidos = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.getTotal() > 500) {
                contagemPedidos++;
                System.out.println("pedido" + pedido.getNumero());
            }
        }
    }
}