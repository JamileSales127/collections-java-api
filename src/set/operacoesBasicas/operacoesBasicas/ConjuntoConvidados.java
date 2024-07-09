package set.operacoesBasicas.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
      this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
      convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
      Convidado convidadoARemover = null;
      if (!convidadoSet.isEmpty()){
        for (Convidado c: convidadoSet){
          if (c.getCodigoConvite() == codigoConvite){
            convidadoARemover = c;
            break;
          }
        }
        convidadoSet.remove(convidadoARemover);
      }
    }

    public  int contarConvidados(){
      return convidadoSet.size();
    }

    public void exibirConvidados(){
      System.out.println(convidadoSet);
    }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    conjuntoConvidados.adicionarConvidado("Maria", 210);
    conjuntoConvidados.adicionarConvidado("Maria", 211);
    conjuntoConvidados.adicionarConvidado("Sandra", 212);
    conjuntoConvidados.adicionarConvidado("Aurora", 213);

    conjuntoConvidados.exibirConvidados();
    System.out.println(conjuntoConvidados.contarConvidados());
    conjuntoConvidados.removerConvidadoPorCodigoConvite(211);
    conjuntoConvidados.exibirConvidados();
    System.out.println(conjuntoConvidados.contarConvidados());

  }
}
