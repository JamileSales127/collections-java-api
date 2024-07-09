package set.operacoesBasicas.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> setProduto = new HashSet<>();

  public CadastroProdutos() {
    this.setProduto = new HashSet<>();
  }

  public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
    setProduto.add(new Produto(codigo,nome, quantidade, preco));
  }

  public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(setProduto);
    return produtosPorNome;
  }

  public Set<Produto> exibirPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(setProduto);
    return produtosPorPreco;

  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1111, "Arroz", 5,5);
    cadastroProdutos.adicionarProduto(2222, "Feijão", 6,6);
    cadastroProdutos.adicionarProduto(3333, "Macarrão", 2,2);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());
  }
}
