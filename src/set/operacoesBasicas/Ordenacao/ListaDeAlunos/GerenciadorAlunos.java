package set.operacoesBasicas.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  private Set<Aluno> alunoSet;

  public GerenciadorAlunos() {
    this.alunoSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media){
    alunoSet.add(new Aluno(nome, matricula, media));
  }

  public Set<Aluno> removerAluno(long matricula){
    Set<Aluno> removeAluno = new HashSet<>();
    for (Aluno a: alunoSet){
      if (a.getMatricula() == matricula){
        removeAluno.add(a);
        break;
      }
    }
    alunoSet.removeAll(removeAluno);
    return removeAluno;
  }

  public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
    return alunosPorNome;
  }

  public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());
    alunosPorNota.addAll(alunoSet);
    return alunosPorNota;
  }

  public void exibirAlunos(){
    System.out.println(alunoSet);
  }

  public static void main(String[] args) {
    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    gerenciadorAlunos.adicionarAluno("Marcos", 8888888l, 8.5);
    gerenciadorAlunos.adicionarAluno("Monnica", 8889999l, 5.5);
    gerenciadorAlunos.adicionarAluno("Marta", 8880000l, 6.5);
    gerenciadorAlunos.adicionarAluno("Marcos Vinicius", 8885555l, 7.5);

 gerenciadorAlunos.removerAluno(8889999l);
    gerenciadorAlunos.exibirAlunos();

  }

}
