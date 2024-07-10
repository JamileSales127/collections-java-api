package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContagemDePalavras {

  private Map<String, Integer> contagemPalavrasMap;

  public ContagemDePalavras() {
    this.contagemPalavrasMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem){
    contagemPalavrasMap.put(palavra,contagem);
  }

  public void removerPalavra(String palavra){
    contagemPalavrasMap.remove(palavra);
  }

  public int exibirContagemPalavras(){
    int contagemTotal = 0;
    for (int contagem : contagemPalavrasMap.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavraMaisFrequente(){
    String linguagemMaisFrequente = null;
    int maiorContagem = 0;
    for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
      if (entry.getValue() > maiorContagem) {
        maiorContagem = entry.getValue();
        linguagemMaisFrequente = entry.getKey();
      }
    }
    return linguagemMaisFrequente;
  }



}
