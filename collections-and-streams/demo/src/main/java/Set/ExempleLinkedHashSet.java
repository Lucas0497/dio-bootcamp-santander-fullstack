package Set;

/*
- QUANDO UTILIZAR --> Quando é necessário manter a ordem de inserção dos elementos.
- PADRÃO DE ORDENAÇÃO --> Mantém os elementos na ordem em que foram adicionados.
- PERFORMANCE --> É a implementação mais lenta por manter os elementos na ordem em que foram inseridos.
 */

import java.util.Iterator;
import java.util.LinkedHashSet;


public class ExempleLinkedHashSet {
    public static void main(String[] args) {

        // Instanciando LinkedHashSet
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adicionando valores ao set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        // Remove um elemento do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        // Retorna quantidade de elementos no set
        System.out.println(sequenciaNumerica.size());

        // Navegando no set através de iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.print("Utilizando While --> ");
            System.out.println(iterator.next());
        }

        System.out.println("\n");

        for (Integer elemento: sequenciaNumerica){
            System.out.print("Utilizando For --> ");
            System.out.println(elemento);
        }

        // Retorna um boolean informando se o set esta vazio
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
