import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Pedido> pedidos = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getTotal() > 500) {
                System.out.println("pedido" + pedido.getNumero());
            }
        }
    }
}