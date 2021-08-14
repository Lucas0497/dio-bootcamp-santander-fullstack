package Set;

/*
- Crie um Set e execute as seguintes operações:
- Adicione 5 números inteiros: 3, 88, 20, 44, 3
- Navegue no Set exibindo cada número no console
- Remova o primeiro item do Set
- Adicione um novo numero no Set: 23
- Verifique o tamanho do Set.
- Verifique se o Set está vazio.

 */

import java.util.TreeSet;
import java.util.Iterator;

public class ExercicioSet {
    public static void main(String[] args) {
        System.out.println("Set escolhido: TreeSet\n");

        TreeSet<Integer> treeExercicio = new TreeSet<>();
        System.out.println("O set foi instanciado !\n");

        treeExercicio.add(3);
        treeExercicio.add(88);
        treeExercicio.add(20);
        treeExercicio.add(44);
        treeExercicio.add(3);
        System.out.println("Um total de 5 elementos foram adicionados a árvore\n");

        System.out.println("Percorrendo e e exibindo cada elemento da árvore com For");
        for (Integer elem: treeExercicio){
            System.out.println("--> " + elem);
        }

        System.out.print("\n");

        treeExercicio.pollFirst();
        System.out.println("O primeiro elemento do set foi excluído");

        treeExercicio.add(23);
        System.out.println("O número 23 foi adicionado ao set");

        System.out.println("O tamanho do set atual é: " + treeExercicio.size());

        System.out.print("O set está vazio ? ");
        if (treeExercicio.isEmpty()){
            System.out.println("Sim");
        }else {
            System.out.println("Não");
        }

    }
}
