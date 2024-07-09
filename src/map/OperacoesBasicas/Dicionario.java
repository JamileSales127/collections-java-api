package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionarioMap;

  public Dicionario() {
    this.dicionarioMap = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    dicionarioMap.put(palavra, definicao);
  }

  public void removerPalavra(String palavra){
    if (!dicionarioMap.isEmpty()) {
      dicionarioMap.remove(palavra);
    }
  }

  public void exibirPalavras(){
    System.out.println(dicionarioMap);
  }

  public String pesquisarPorPalavra(String palavra){
    String pesquisaPalavra = null;
    if (!dicionarioMap.isEmpty()){
     pesquisaPalavra =  dicionarioMap.get(palavra);
    }
    return pesquisaPalavra;
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("Alvíssaras", "Expressão de alegria por notícia recebida.");
    dicionario.adicionarPalavra("Deletério", "Degradante, insalubre, prejudicial.");
    dicionario.adicionarPalavra("Desasnado", "Que recebeu instrução, que desasnou.");


    dicionario.removerPalavra("Alvíssaras");
    dicionario.exibirPalavras();
    System.out.println(dicionario.pesquisarPorPalavra("Desasnado"));

  }
}
