package lista.de.tarefas;

import java.util.List;

public class Tarefa {
//  adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
//  removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
//  obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
//  obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
  private String descricao;

  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return "Tarefa: " + descricao + '\'';
  }
}
