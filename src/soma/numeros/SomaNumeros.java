package soma.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
  private List<Integer> integerList;

  @Override
  public String toString() {
    return "Lista de inteiros: " +
         integerList ;
  }

  public SomaNumeros() {
    this.integerList = new ArrayList<>();
  }

  public void adicionarNumero(int numero){
    integerList.add(numero);
  }

  public void calcularSoma(){
    if (!integerList.isEmpty()) {
      int soma = 0;
      for (Integer n : integerList) {
        soma += n.intValue();
      }
      System.out.println("A soma é " + soma);
    }
  }

  public void encontrarMaiorNumero(){
   if (!integerList.isEmpty()){
    int maior = Collections.max(integerList);
     System.out.println("Maior número é: " + maior);
    }
  }

  public void encontrarMenorNumero(){
    if (!integerList.isEmpty()){
      int menor = Collections.min(integerList);
      System.out.println("Menor número é: " + menor);
    }
  }

  public void removerNumero(int numero) {
    integerList.remove(Integer.valueOf(numero));
  }

  public void exibirNumeros(){
    System.out.println("Lista de números" + integerList);
  }



  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(1);
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(4);

    System.out.println(somaNumeros);
    somaNumeros.calcularSoma();
    somaNumeros.encontrarMaiorNumero();
    somaNumeros.encontrarMenorNumero();
    somaNumeros.exibirNumeros();
    somaNumeros.removerNumero(4);
    somaNumeros.exibirNumeros();
  }
}
