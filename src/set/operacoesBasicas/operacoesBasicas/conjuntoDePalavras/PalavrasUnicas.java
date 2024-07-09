package set.operacoesBasicas.operacoesBasicas.conjuntoDePalavras;

public class PalavrasUnicas {
  private String palavra;

  public PalavrasUnicas(String palavra) {
    this.palavra = palavra;
  }

  public String getPalavra() {
    return palavra;
  }

  @Override
  public String toString() {
    return "PalavrasUnicas{" +
        "palavra='" + palavra + '\'' +
        '}';
  }
}
