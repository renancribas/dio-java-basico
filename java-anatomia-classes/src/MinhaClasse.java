public class MinhaClasse {
  public static void main (String [] args) {

    String primeiroNome = "Renan";
    String segundoNome = "Cidade Ribas";
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println (nomeCompleto);

  }
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
