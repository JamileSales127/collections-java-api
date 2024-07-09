package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(preco, nome, quantidade));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque(){
    double valorTotalEstoque = 0;
    if (!estoqueProdutosMap.isEmpty()){
      for (Produto p: estoqueProdutosMap.values()){
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
        if (p.getPreco() > maiorPreco){
          produtoMaisCaro = p;
          maiorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisCaro;
  }
  public Produto obterProdutoMaisBarato(){
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    }
    return produtoMaisBarato;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

    estoqueProdutos.adicionarProduto(354465L, "FEIJÃO", 5, 5.0);
    estoqueProdutos.adicionarProduto(354458L, "ARROZ", 2, 6.0);
  ;
    estoqueProdutos.adicionarProduto(354475L, "FARINHA", 3, 15.0);
    estoqueProdutos.adicionarProduto(354495L, "CAFÉ", 1, 10.0);
    System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    System.out.println(estoqueProdutos.obterProdutoMaisCaro());
    System.out.println(estoqueProdutos.obterProdutoMaisBarato());

  }
}
