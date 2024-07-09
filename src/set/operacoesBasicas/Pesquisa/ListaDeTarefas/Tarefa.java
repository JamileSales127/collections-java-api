package set.operacoesBasicas.Pesquisa.ListaDeTarefas;

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
  public String toString() {
    return "Tarefa{" +
        "descricao='" + descricao + '\'' +
        ", check=" + check +
        '}';
  }
}
