import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Foncionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Foncionario("vinicius", 3200, 21));
        funcionarios.add(new Foncionario("joana", 76000, 20));


        for (Foncionario funcionario : funcionarios){
            if (funcionario.getSalarioAnual() > 50000 && funcionario.getIdade() < 30) {
                System.out.println(funcionario.getNome());
            }
        }
    }
}
