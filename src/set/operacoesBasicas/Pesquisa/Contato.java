package set.operacoesBasicas.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private long contato;

  public Contato(long contato, String nome) {
    this.contato = contato;
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public long getContato() {
    return contato;
  }

  public void setContato(int contato) {
    this.contato = contato;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Contato contato)) {
      return false;
    }
    return Objects.equals(nome, contato.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(nome);
  }

  @Override
  public String toString() {
    return "Contato{" +
        "nome='" + nome + '\'' +
        ", contato=" + contato +
        '}';
  }
}
