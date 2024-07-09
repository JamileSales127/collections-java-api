package map.Pesquisa;

public class Produto {
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(double preco, String nome, int quantidade) {
    this.preco = preco;
    this.nome = nome;
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Produto{" +
        "nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }
}
