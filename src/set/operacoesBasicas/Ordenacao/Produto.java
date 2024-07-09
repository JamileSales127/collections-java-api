package set.operacoesBasicas.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long codigo, String nome, int quantidade, double preco) {
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public long getCodigo() {
    return codigo;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Produto produto)) {
      return false;
    }
    return getCodigo() == produto.getCodigo();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getCodigo());
  }

  @Override
  public String toString() {
    return "Produto{" +
        "codigo=" + codigo +
        ", nome='" + nome + '\'' +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
  }

  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }
}
