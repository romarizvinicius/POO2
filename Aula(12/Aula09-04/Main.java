public class Main {
   public static void main(String[] args) {
      Designer designer = new Designer();
      designer.setNome("joao");
      designer.setSalario(3000);

      Programador programador = new Programador();
      programador.setNome("maria");
      programador.setSalario(3000);

      System.out.println(programador.calcularBonificacao());
      System.out.println(designer.calcularBonificacao());
   }
}
