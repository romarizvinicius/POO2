public class Endereco {

    String rua;
    int numero;
    String completmento;
    String bairro;
    String cidade;
    String uf;
    int cep;

    public Endereco(String rua, int numero, String completmento, String bairro, String cidade, String uf, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.completmento = completmento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCompletmento() {
        return completmento;
    }

    public void setCompletmento(String completmento) {
        this.completmento = completmento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

}