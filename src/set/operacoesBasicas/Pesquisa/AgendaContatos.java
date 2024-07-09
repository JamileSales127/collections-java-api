package set.operacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
      private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int contato){
    contatoSet.add(new Contato(contato, nome));
  }

  public void exibirContato(){
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisaPorNome(String nome){
    Set<Contato> pesquisaNome = new HashSet<>();
      for (Contato c: contatoSet){
        if (c.getNome().startsWith(nome)){
          pesquisaNome.add(c);
        }
    }
      return pesquisaNome;
  }

  public Contato atualizarContato(String nome, int novoNumero){
    Contato contatoAtualizado = null;

    for (Contato c: contatoSet){
      if (c.getNome().equalsIgnoreCase(nome)){
        c.setContato(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("João Marcos", 1234);
    agendaContatos.adicionarContato("Marcos", 1234);
    agendaContatos.adicionarContato("Maria", 3333);
    agendaContatos.adicionarContato("Mariana", 4444);
    agendaContatos.adicionarContato("João", 5555);

    System.out.println(agendaContatos.pesquisaPorNome("João"));
    agendaContatos.atualizarContato("João", 1111);
    System.out.println(agendaContatos.pesquisaPorNome("João"));

  }

}
