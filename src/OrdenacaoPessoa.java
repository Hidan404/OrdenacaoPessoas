import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
   List<Pessoa> pessoas = new ArrayList<>();

   public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
   }

   public List<Pessoa> ordenadoIdade(){
    List<Pessoa> pessoasIdade =new ArrayList<>(pessoas);

    Collections.sort(pessoasIdade);
    return pessoasIdade;
   }

   public List<Pessoa> ordenarAltura(){
    List<Pessoa> pessoasAltura =new ArrayList<>(pessoas);

    Collections.sort(pessoasAltura, new ComparatorAltura());
    return pessoasAltura;
   }
}
