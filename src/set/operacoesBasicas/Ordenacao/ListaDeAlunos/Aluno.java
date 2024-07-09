package set.operacoesBasicas.Ordenacao.ListaDeAlunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
  private String nome;
  private Long matricula;
  private double media;

  public Aluno(String nome, Long matricula, double media) {
    this.nome = nome;
    this.matricula = matricula;
    this.media = media;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Aluno aluno)) {
      return false;
    }
    return Objects.equals(getMatricula(), aluno.getMatricula());
  }


  @Override
  public int hashCode() {
    return Objects.hashCode(getMatricula());
  }

  public String getNome() {
    return nome;
  }

  public double getMedia() {
    return media;
  }

  public Long getMatricula() {
    return matricula;
  }

  @Override
  public String toString() {
    return "Aluno{" +
        "nome='" + nome + '\'' +
        ", matricula=" + matricula +
        ", media=" + media +
        '}';
  }

  @Override
  public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
  }
}
