package set.operacoesBasicas.Pesquisa.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {
  private String descricao;
  private boolean check;

  public Tarefa(String descricao) {
    this.descricao = descricao;
    this.check = check;
  }

  public String getDescricao() {
    return descricao;
  }

  public boolean isCheck() {
    return check;
  }

  public void setCheck(boolean check) {
    this.check = check;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Tarefa tarefa)) {
      return false;
    }
    return Objects.equals(descricao, tarefa.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(descricao);
  }

  @Override
  public String toString() {
    return "Tarefa{" +
        "descricao='" + descricao + '\'' +
        ", check=" + check +
        '}';
  }
}
