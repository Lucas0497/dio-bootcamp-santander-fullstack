package List;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
Crie uma lista e executa as seguintes operações:
- Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa e João.
- Navegue na lista exibindo cada nome no console.
- Substitua o nome Carlos por Roberto.
- Retorne o nome da posição 1.
- Remova o nome da posição 4.
- Remova o nome João.
- Retorne a quantidade de itens da lista.
- Verifique se o nome juliano existe na lista.
- Crie uma nova lista com os nomes Ismael e Rodrigo.
- Adicione todos os itens da nova lista na primeira lista criada.
- Ordene os itens da lista por ordem alfabética.
- Verifique se a lista esta vazia
 */
public class ExercicoLista {
    public static void main(String[] args) {


        List<String> lista01 = new ArrayList<>();
        System.out.println("Lista Criada");

        lista01.add("Juliana");
        lista01.add("Pedro");
        lista01.add("Carlos");
        lista01.add("Larissa");
        lista01.add("João");
        System.out.println("Total de 5 nomes adicionados a lista");

        System.out.println("Navegando na lista e exibindo cada nome no console.");
        for (String nomeElem: lista01){
            System.out.println(nomeElem);
        }

        lista01.set(2, "Roberto");
        System.out.println("Nome Carlos substituído por Roberto");

        String gets = lista01.get(1);
        System.out.println("Nome contido na posição 1: " + gets);

        lista01.remove(4);
        System.out.println("Nome da posição 4 removido !");

        lista01.remove("João");
        System.out.println("O nome João foi removido 1");

        int tamanho = lista01.size();
        System.out.println("Atualmente a lista contém " + tamanho + " itens");

        System.out.println("A lista contem o nome Juliano ?" + lista01.contains("Juliano"));

        List<String> lista02 = new ArrayList<>();
        System.out.println("A segunda lista foi instanciada !");

        lista02.add("Ismael");
        lista02.add("Rodrigo");
        System.out.println("Nomes Ismael e Rodrigo adicionados a lista 02");

        lista01.addAll(lista02);
        System.out.println("Todos os itens da lista 02 foram adicionados a lista 01");

        Collections.sort(lista01);
        System.out.println("A lista 01 foi ordenada em ordem alfabética");

        System.out.print("A lista esta vazia ? ");
        if (lista01.isEmpty()){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }

        System.out.println("Resultado final da lista 01:");
        System.out.println(lista01);


    }
}
