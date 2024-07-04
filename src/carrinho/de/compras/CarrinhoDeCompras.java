package carrinho.de.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  private List<Item> itemList;

  public CarrinhoDeCompras(){
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade){
    itemList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome){
    List<Item> listRemover = new ArrayList<>();

    for (Item t: listRemover) {
      if (t.getNome().equalsIgnoreCase(nome)){
        listRemover.add(t);
      }
    }
    itemList.removeAll(listRemover);
  }

  public void calcularValorTotal(){
    double somaValores = 0;
    for (Item item : itemList) {
      somaValores += item.getPreco() * item.getQuantidade();
    }
    System.out.println("Valor total do carrinho: " + somaValores);

  }

  public void exibirItens(){
    System.out.println(itemList);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Arroz", 5.50, 4);
    carrinhoDeCompras.adicionarItem("Feijão", 6.50, 5);
    carrinhoDeCompras.adicionarItem("Café", 5.00, 4);
    carrinhoDeCompras.adicionarItem("Carne", 45.50, 1);

    carrinhoDeCompras.calcularValorTotal();
    carrinhoDeCompras.removerItem("Arroz");
    carrinhoDeCompras.exibirItens();
    carrinhoDeCompras.calcularValorTotal();

  }

}
