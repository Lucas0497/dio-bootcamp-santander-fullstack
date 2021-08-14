package Map;

/*
- Entrada de chaves (keys) e valores.
- Permite valores repetidos, mas não permite repetição de chaves (keys).
- Permite adição, busca por chave (keys) ou valor, atualização, remoção e navegação.
- Pode ser ordenado.
- Método mais comum.
- Correlaciona o objeto Key com o objeto Value.

 */

import java.util.HashMap;
import java.util.Map;

public class ExempleHashMap {
    public static void main(String[] args) {
        // Instanciando o Map
        Map<String, Integer> campeoesMundias = new HashMap<>();

        // Adicionando elementos ao Map (key - value)
        campeoesMundias.put("Brasil", 5);
        campeoesMundias.put("Alemanha", 4);
        campeoesMundias.put("Itália", 4);
        campeoesMundias.put("Uruguai", 2);
        campeoesMundias.put("Argentina", 2);
        campeoesMundias.put("França", 2);
        campeoesMundias.put("Inglaterra", 1);
        campeoesMundias.put("Espanha", 1);
        System.out.println(campeoesMundias);

        // Atualiza o valor para a chave Brasil
        campeoesMundias.put("Brasil", 6);
        System.out.println(campeoesMundias);

        // Retorna o valor contido na chave Argentina
        System.out.println(campeoesMundias.get("Argentina"));

        // Retorna um boolean informando se existe a chave França
        System.out.println(campeoesMundias.containsKey("França"));

        // Remove a chave França
        System.out.println(campeoesMundias.remove("França"));

        // Retorna um boolean informando se existe a chave França
        System.out.println(campeoesMundias.containsKey("França"));

        // Retorna um boolean informando se existe alguma chave com valor 6
        System.out.println(campeoesMundias.containsValue(6));

        // Retorna o tamanho atual do mapa
        System.out.println(campeoesMundias.size());

        // Métodos para percorrer o Mapa e exibir as chaves e valores correspondentes a ela
        System.out.println("\nMetodo 1:");
        for (Map.Entry<String, Integer> entry: campeoesMundias.entrySet()){
            System.out.println(entry.getKey() + " -- > " + entry.getValue());
        }

        System.out.println("\nMetodo 2:");
        for (String key: campeoesMundias.keySet()){
            System.out.println(key + " -- > " + campeoesMundias.get(key));
        }

        // Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundias.size());
        campeoesMundias.clear();
        System.out.println(campeoesMundias.size());









    }
}
