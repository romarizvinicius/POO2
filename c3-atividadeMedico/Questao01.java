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

        Endereco indereco = new Endereco("das flores ", 266, "casa 34", "maru ", "gorick", "uf ", 844);
        System.out.println("dados do Endereco ");
        System.out.println("rua" + indereco.getRua());
        System.out.println("numero " + indereco.getNumero());
        System.out.println("complemento " + indereco.getCompletmento());
        System.out.println("bairro " + indereco.getBairro());
        System.out.println("cidade " + indereco.getCidade());
        System.out.println("uf " + indereco.getUf());
        System.out.println("cep " + indereco.getCep());

        Medico medico = new Medico (300, "julio", 'm', "cardio", indereco);
        System.out.println("dados do medico");
        System.out.println("codigp  " + medico.getCodigo());
        System.out.println("nome " + medico.getNome());
        System.out.println("sexo  " + medico.getSexo());
        System.out.println("especialidade " + medico.getEspecialidade());
        System.out.println("endereço ");
        System.out.println("rua " + medico.indereco.rua);
        System.out.println("numero " + medico.indereco.numero);
        System.out.println("complemento " + medico.indereco.completmento);
        System.out.println("bairro " + medico.indereco.bairro);
        System.out.println("cidade " + medico.indereco.cidade);
        System.out.println("uf " + medico.indereco.uf);
        System.out.println("cep " + medico.indereco.cep);

        medico.setNome("julia");
        medico.setCodigo(290);
        medico.setSexo('f');
        medico.setEspecialidade("neuro");
        medico.indereco.setRua("rosario");
        medico.indereco.setBairro("cordeiro");
        medico.indereco.setCep(6784);
        medico.indereco.setCompletmento("apt 20");
        medico.indereco.setCidade("campos");

        System.out.println("dados do medico");
        System.out.println("codigp  " + medico.getCodigo());
        System.out.println("nome " + medico.getNome());
        System.out.println("sexo  " + medico.getSexo());
        System.out.println("especialidade " + medico.getEspecialidade());
        System.out.println("endereço ");
        System.out.println("rua " + medico.indereco.rua);
        System.out.println("numero " + medico.indereco.numero);
        System.out.println("complemento " + medico.indereco.completmento);
        System.out.println("bairro " + medico.indereco.bairro);
        System.out.println("cidade " + medico.indereco.cidade);
        System.out.println("uf " + medico.indereco.uf);
        System.out.println("cep " + medico.indereco.cep);
        
        s.close();
    }
}
