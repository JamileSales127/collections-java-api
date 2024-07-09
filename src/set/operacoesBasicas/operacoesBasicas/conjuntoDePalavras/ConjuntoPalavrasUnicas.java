package set.operacoesBasicas.operacoesBasicas.conjuntoDePalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra){
    palavrasUnicasSet.add(new PalavrasUnicas(palavra));
  }

  public void removerPalavra(String palavra){
    PalavrasUnicas removePalavra = null;
    if (!palavrasUnicasSet.isEmpty()){
      for (PalavrasUnicas p : palavrasUnicasSet){
        if (p.getPalavra() == palavra){
          removePalavra = p;
          break;
        }
      }
      if (removePalavra != null) {
        palavrasUnicasSet.remove(removePalavra);
      }
    }
  }

  public boolean verificarPalavra(String palavra) {
    for (PalavrasUnicas p : palavrasUnicasSet) {
      if (p.getPalavra().equals(palavra)) {
        System.out.println(palavra + " existe no conjunto");
        return true;
      }
    }
    System.out.println(palavra + " não existe no conjunto");
    return false;
  }


  public Set<PalavrasUnicas> exibirPalavrasUnicas(){
    return palavrasUnicasSet;
  }

  public void tamanhoSet(){
    System.out.println(palavrasUnicasSet.size());
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("Mar");
    conjuntoPalavrasUnicas.adicionarPalavra("Sofá");
    conjuntoPalavrasUnicas.adicionarPalavra("Choro");
    conjuntoPalavrasUnicas.adicionarPalavra("Emoção");
    conjuntoPalavrasUnicas.adicionarPalavra("Sorrir");

//    System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());
//    conjuntoPalavrasUnicas.tamanhoSet();
    conjuntoPalavrasUnicas.removerPalavra("Mar");
//    System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());
//    conjuntoPalavrasUnicas.tamanhoSet();
    conjuntoPalavrasUnicas.verificarPalavra("Mar");
    System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());

  }

}
