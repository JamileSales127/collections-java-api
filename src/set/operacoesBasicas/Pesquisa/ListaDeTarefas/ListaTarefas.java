package set.operacoesBasicas.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;
import lista.de.tarefas.ListaDeTarefas;

public class ListaTarefas {
  private Set<Tarefa> tarefaSet;

  public ListaTarefas() {
    this.tarefaSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao){
    tarefaSet.add(new Tarefa(descricao));
  }

  public Set<Tarefa> removerTarefa(String descricao){
    Set<Tarefa> removeTarefa = new HashSet<>();
    for (Tarefa t: tarefaSet){
      if (t.getDescricao().equalsIgnoreCase(descricao)){
        removeTarefa.add(t);
      }
    }
    tarefaSet.removeAll(removeTarefa);
    return removeTarefa;
  }

  public void exibirTarefas(){
    System.out.println(tarefaSet);
  }

  public void contarTarefas(){
    System.out.println(tarefaSet.size());
  }

  public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t: tarefaSet){
      if (t.isCheck() == true){
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa t: tarefaSet){
      if (t.isCheck() == false){
        tarefasPendentes.add(t);
      }

    }
    return tarefasPendentes;
  }

  public Tarefa marcarTarefaConcluida(String descricao){
    Tarefa tarefaConcluida = null;

    for (Tarefa c: tarefaSet){
      if (c.getDescricao().equalsIgnoreCase(descricao)){
        c.setCheck(true);
      }
    }
    return tarefaConcluida;
  }

  public Tarefa marcarTarefaPendente(String descricao){
    Tarefa tarefaPendente = null;

    for (Tarefa c: tarefaSet){
      if (c.getDescricao().equalsIgnoreCase(descricao)){
        c.setCheck(false);
      }
    }
    return tarefaPendente;
  }

  public Set<Tarefa> limparListaTarefas(){
    Set<Tarefa> listaLimpa = new HashSet<>(tarefaSet);
    listaLimpa.removeAll(tarefaSet);
    return listaLimpa;
  }

  public static void main(String[] args) {
    ListaTarefas listaDeTarefasSet = new ListaTarefas();

    listaDeTarefasSet.adicionarTarefa("banho");
    listaDeTarefasSet.adicionarTarefa("academia");
    listaDeTarefasSet.adicionarTarefa("estudar");
    listaDeTarefasSet.adicionarTarefa("descançar");

   listaDeTarefasSet.exibirTarefas();
   listaDeTarefasSet.contarTarefas();
   listaDeTarefasSet.removerTarefa("descançar");
   listaDeTarefasSet.marcarTarefaConcluida("banho");
   listaDeTarefasSet.exibirTarefas();
   listaDeTarefasSet.marcarTarefaPendente("banho");
   listaDeTarefasSet.exibirTarefas();

    System.out.println(listaDeTarefasSet.obterTarefasConcluidas());
    System.out.println(listaDeTarefasSet.obterTarefasPendentes());
    System.out.println(listaDeTarefasSet.limparListaTarefas());

  }






}
