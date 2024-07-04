package lista.de.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

  private List<Tarefa> list;

  public ListaDeTarefas() {
    this.list = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    list.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> listaRemover = new ArrayList<>();
    for (Tarefa t: list){
      if (t.getDescricao().equalsIgnoreCase(descricao)){
        listaRemover.add(t);
      }
    }
    list.removeAll(listaRemover);
  }

  public int obterNumeroTotalTarefas(){
    return list.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(list);
  }

  public static void main(String[] args) {
    ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
    listaDeTarefas.adicionarTarefa("Tarefa 1");
    listaDeTarefas.adicionarTarefa("Tarefa 1");
    listaDeTarefas.adicionarTarefa("Tarefa 2");
    listaDeTarefas.adicionarTarefa("Tarefa 3");
    listaDeTarefas.adicionarTarefa("Tarefa 4");
    listaDeTarefas.adicionarTarefa("Tarefa 8");
    listaDeTarefas.adicionarTarefa("Tarefa 2");
    System.out.println("Número total de tarefas é de: " + listaDeTarefas.obterNumeroTotalTarefas());
    listaDeTarefas.removerTarefa("Tarefa 1");
    listaDeTarefas.removerTarefa("Tarefa 2");
    System.out.println("Número total de tarefas é de: " + listaDeTarefas.obterNumeroTotalTarefas());
    listaDeTarefas.obterDescricoesTarefas();
  }

}