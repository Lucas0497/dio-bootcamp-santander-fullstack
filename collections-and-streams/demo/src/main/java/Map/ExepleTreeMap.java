package Map;
/*
- Entrada de chaves (keys) e valores
- Permite valores repetidos, mas não permite repetição de chaves (keys).
- Permite adição, busca por chave (keys) ou valor (value), atualização, remoção e navegação.
- Pode ser ordenado.
- Correlaciona o objeto Key com o objeto Value.
- Ordena os valores com algoritmo de árvore binária, ou seja, não respeita a ordem de inclusão.
- Mais utilizado quando necessita de menos performance e ordenação do tipo árvore.

*/


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExepleTreeMap {
    public static void main(String[] args) {
        //Instanciando TreeMap
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Montando a árvore com as capitais (Estado / Cidade)
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Porto Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        System.out.println(treeCapitais);

        // Retorna a primeira chave no topo da árvore
        System.out.println(treeCapitais.firstKey());

        // Retorna a ultima chave no final da árvore
        System.out.println(treeCapitais.lastKey());

        // Retorna a primeira chave abaixo da chave passada como parametro
        System.out.println(treeCapitais.lowerKey("SC"));

        // Retorna a primeira chave acima da chave passada como parametro
        System.out.println(treeCapitais.higherKey("SC"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira chave e valor contido no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey() + " --> " + treeCapitais.firstEntry().getValue());

        // Retorna a ultima chave e valor contido no final da árvore
        System.out.println(treeCapitais.lastEntry().getKey() + " --> " + treeCapitais.lastEntry().getValue());

        // Navega por todo o map utilizando iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        System.out.println("\nUtilizando While");
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " --> " + treeCapitais.get(key));
        }

        System.out.println("\nUtilizando For");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " --> " + treeCapitais.get(capital));
        }

        System.out.println("\nUtilizando For 2");
        for (Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " --> " + capital.getValue());

        }










    }
}
