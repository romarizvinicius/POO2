public class CarrinhoDeCompras {
    private Compras[] Compras;
    private String privacidade;
    private String usuario;
    private int tamanho;
    private int proxima;

    public CarrinhoDeCompras(Compras[] compras, String privacidade, String usuario, int tamanho, int proxima) {
        Compras = compras;
        this.privacidade = privacidade;
        this.usuario = usuario;
        this.tamanho = tamanho;
        this.proxima = proxima;
    }

    public Compras[] getCompras() {
        return Compras;
    }

    public void setCompras(Compras[] compras) {
        Compras = compras;
    }

    public String isPrivacidade() {
        return privacidade;
    }

    public void setPrivacidade(String privacidade) {
        this.privacidade = privacidade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getProxima() {
        return proxima;
    }

    public void setProxima(int proxima) {
        this.proxima = proxima;
    }

    public void add(String item) {
        if (privacidade.matches(usuario)) {
            if (proxima < tamanho) {
                Compras[proxima] = new Compras();
                proxima++;
            }

        }
    }

    public void sub() {
        if (privacidade.matches(usuario)) {
            for (int i = 0; i < proxima; i++) {
                if (Compras[i] != null && Compras[i].equals(tamanho)) {
                    for (int j = i; j < proxima - 1; j++) {
                        Compras[j] = Compras[j + 1];
                    }
                    Compras[proxima - 1] = null;
                    proxima--;
                }
            }
        }
    }

    public void listarItens() {
        System.out.println("Itens no carrinho de " + usuario + ":");
        for (int i = 0; i < proxima; i++) {
            System.out.println("- " + Compras[i]);
        }
    }
}