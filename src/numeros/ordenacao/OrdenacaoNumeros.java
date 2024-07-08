package numeros.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements  Comparable<Integer>{
  private List<Integer> integerList;

  public OrdenacaoNumeros() {
    this.integerList = new ArrayList<>();
  }

  @Override
  public int compareTo(Integer i) {
    return 0;
  }

  public void adicionarNumero(int numero){
    integerList.add(numero);
  }

  public List<Integer> ordenarAscendente(){
    List<Integer> ordenaAscendente = new ArrayList<>(integerList);
    Collections.sort(ordenaAscendente);
    return ordenaAscendente;
  }

  public List<Integer> ordenarDescendente(){
    List<Integer> ordenarDescendente = new ArrayList<>(integerList);
    Collections.reverse(ordenarDescendente);
    return ordenarDescendente;
  }


  public static void main(String[] args) {
    OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

    ordenacaoNumeros.adicionarNumero(1);
    ordenacaoNumeros.adicionarNumero(3);
    ordenacaoNumeros.adicionarNumero(2);
    ordenacaoNumeros.adicionarNumero(4);

    System.out.println(ordenacaoNumeros.integerList);
    System.out.println(ordenacaoNumeros.ordenarAscendente());
    System.out.println(ordenacaoNumeros.ordenarDescendente());

  }

}
