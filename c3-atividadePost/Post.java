public class Post {
    String texto;
    String link;
    int numeroDeCurtidas = 0;
    int numeroDeCompartilhamentos = 0;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getNumeroDeCurtidas() {
        return numeroDeCurtidas;
    }

    public void setNumeroDeCurtidas(int numeroDeCurtidas) {
        this.numeroDeCurtidas = numeroDeCurtidas;
    }

    public int getNumeroDeCompartilhamentos() {
        return numeroDeCompartilhamentos;
    }

    public void setNumeroDeCompartilhamentos(int numeroDeCompartilhamentos) {
        this.numeroDeCompartilhamentos = numeroDeCompartilhamentos;
    }

    public void curtir(){
        numeroDeCurtidas++;
    }

    public void compartilhar(){
        numeroDeCompartilhamentos++;
    }

}
