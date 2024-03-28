public class BancoDeDados {
    private Dados[] dados;
    private String privacidade;
    private String usuario;
    private int tamanho;
    private int proximo;

    public BancoDeDados(Dados[] dados, String privacidade, String usuario, int tamanho, int proximo) {
        this.dados = dados;
        this.privacidade = privacidade;
        this.usuario = usuario;
        this.tamanho = tamanho;
        this.proximo = proximo;
    }

    public Dados[] getDados() {
        return dados;
    }

    public void setDados(Dados[] dados) {
        this.dados = dados;
    }

    public String getPrivacidade() {
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

    public int getProximo() {
        return proximo;
    }

    public void setProximo(int proximo) {
        this.proximo = proximo;
    }

    public void add(Dados newDados) {
        if (privacidade.equals(usuario)) {
            if (proximo < tamanho) {
                dados[proximo] = newDados;
                proximo++;
            }
        }
    }

    public void sub(int indice) {
        if (privacidade.equals(usuario)) {
            if (indice >= 0 && indice < proximo) {
                for (int i = indice; i < proximo - 1; i++) {
                    dados[i] = dados[i + 1];
                }
                dados[proximo - 1] = null;
                proximo--;

            }
        }

    }
}
