package set.operacoesBasicas.Ordenacao.ListaDeAlunos;

import java.util.Comparator;

public class AlunosPorNota implements Comparator<Aluno> {


  @Override
  public int compare(Aluno a1, Aluno a2) {
    return Double.compare(a1.getMedia(), a2.getMedia());
  }
}
