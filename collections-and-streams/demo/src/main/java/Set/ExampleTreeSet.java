package Set;

/*
- QUANDO UTILIZAR --> Quando é necessário alterar a ordem dos elementos através do uso de comparators.
- PADRÃO DE ORDENAÇÃO --> Mantém a ordem de inserção dos elementos.
- PERFORMANCE --> É performática para leitura dos elementos. Para modificação tem a necessidade de reordenar,
e nesse caso, se tornando mais lenta do que o LinkeHashSet.
- Toda vez que um novo elemento é adicionado, o algoritmo de ordenação de árvore binária é executado.
novamente, isso faz com que o processo de adição de elementos se torne mais lento do que nos demais sets.
 */

import java.util.TreeSet;
import java.util.Iterator;

public class ExampleTreeSet {
    public static void main(String[] args) {
        // Instanciando a árvore
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");


        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais);
        System.out.print("\n");

        // Retorna a última capital da árvore
        System.out.println(treeCapitais.last());
        System.out.println(treeCapitais);
        System.out.print("\n");

        // Retorna a primeira capital abaixo na árvore de capital passada como parâmetro
        System.out.println(treeCapitais.lower("Florianópolis"));
        System.out.println(treeCapitais);
        System.out.print("\n");

        // Retorna a primeira capital abaixo na árvore de capital passada como parâmetro
        System.out.println(treeCapitais.higher("Florianópolis"));
        System.out.println(treeCapitais);
        System.out.print("\n");


        // Retorna a primeira capital no topo da árvore, removendo a do set
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.print("\n");

        // Retorna a primeira capital no final da árvore, removendo a do set
        System.out.println(treeCapitais.pollLast());
        System.out.println(treeCapitais);
        System.out.print("\n");

        // Percorrendo a árvore com iterator
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.print("Utilizando While --> ");
            System.out.println(iterator.next());
        }

        System.out.print("\n");

        for (String capitais: treeCapitais){
            System.out.print("Utilizando For --> ");
            System.out.println(capitais);

        }








    }
}
