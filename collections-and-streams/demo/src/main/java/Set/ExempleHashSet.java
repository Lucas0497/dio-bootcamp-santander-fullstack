package Set;

/*
- QUANDO UTILIZAR --> Quando não é necessário manter uma ordenação.
- PADRÃO DE ORDENAÇÃO --> Não é ordenado e não permite valores repetidos.
- PERFORMANCE --> Por não ter repetição de valores e não ser ordenado, é a implementação mais performática.
- Não respeita a ordem em que os elementos foram incluídos.

 */

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExempleHashSet {
    public static void main(String[] args) {
        // Instanciando HashSet
        Set<Double> notasAlunos = new HashSet<>();

        // Adicionando elementos no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println(notasAlunos);

        // Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos);

        // Retorna a quantidade de elementos no set
        System.out.println(notasAlunos.size());

        // Navegação pelos elementos usando iterator
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.print("Utilizando While --> ");
            System.out.println(iterator.next());
        }
        System.out.print("\n");
        for (Double notas: notasAlunos){
            System.out.print("Utilizando For --> " );
            System.out.println(notas);
        }

        // Remove todos os elementos do set
        notasAlunos.clear();
        System.out.println(notasAlunos);

        // Retorna um boolean informando se o set esta vazio
        System.out.println(notasAlunos.isEmpty());

    }
}
