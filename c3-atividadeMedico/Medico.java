public class Medico {

    int codigo;
    String nome;
    char sexo;
    String especialidade;
    Endereco indereco;

    public Medico(int codigo, String nome, char sexo, String especialidade, Endereco indereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.indereco = indereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getIndereco() {
        return indereco;
    }

    public void setIndereco(Endereco indereco) {
        this.indereco = indereco;
    }

}
