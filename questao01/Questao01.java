import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Paciente Vinicius = new Paciente(1, "Vinicius romariz", "05/09/2003", "homem", "universal", "cachorro", "A+");
        
        System.out.println("dados do paciente");
        System.out.println("codigo " + Vinicius.getCodigo());
        System.out.println("nome " + Vinicius.getNome());
        System.out.println("data de nascimento " + Vinicius.getDataDeNascimento());
        System.out.println("sexo " + Vinicius.getSexo());
        System.out.println("palno de saude " + Vinicius.getPlanoDeSaude());
        System.out.println("alergia " + Vinicius.getAlergia());
        System.out.println("tipo sanguineo " + Vinicius.getTipoSanguineo());

        Vinicius.setNome("ze");
        Vinicius.setCodigo(2);
        Vinicius.setDataDeNascimento("22/08/1990");
        Vinicius.setPlanoDeSaude("planetario");

        System.out.println("dados do paciente");
        System.out.println("codigo " + Vinicius.getCodigo());
        System.out.println("nome " + Vinicius.getNome());
        System.out.println("data de nascimento " + Vinicius.getDataDeNascimento());
        System.out.println("sexo " + Vinicius.getSexo());
        System.out.println("palno de saude " + Vinicius.getPlanoDeSaude());
        System.out.println("alergia " + Vinicius.getAlergia());
        System.out.println("tipo sanguineo " + Vinicius.getTipoSanguineo());

        Endereco endereco = new Endereco("das flores ", 266, "casa 34", "maru ", "gorick", "uf ", 844);
        System.out.println("dados do Endereco ");
        System.out.println("rua" + endereco.getRua());
        System.out.println("numero " + endereco.getNumero());
        System.out.println("complemento " + endereco.getCompletmento());
        System.out.println("bairro " + endereco.getBairro());
        System.out.println("cidade " + endereco.getCidade());
        System.out.println("uf " + endereco.getUf());
        System.out.println("cep " + endereco.getCep());

        Medico medico = new Medico (300, "julio", 'm', "cardio", null);
        System.out.println("dados do medico");
        System.out.println("codigp  " + medico.getCodigo());
        System.out.println("nome " + medico.getNome());
        System.out.println("sexo  " + medico.getSexo());
        System.out.println("especialidade " + medico.getEspecialidade());
        System.out.println("endereço " + medico.getEndereço());

        
        s.close();
    }
}
