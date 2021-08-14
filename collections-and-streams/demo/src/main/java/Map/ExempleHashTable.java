package Map;

/*
- Entrada de chaves (keys) e valores
- Permite valores repetidos, mas não permite repetição de chaves (keys).
- Permite adição, busca por chave (keys) ou valor (value), atualização, remoção e navegação.
- Pode ser ordenado.
- Correlaciona o objeto Key com o objeto Value.

 */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ExempleHashTable {
    public static void main(String[] args) {
        // Instanciando HashTable
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Adicionando valores
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 21);
        System.out.println(estudantes);

        // Atualiza valor da chave
        estudantes.put("Pedro", 55);

        // Remove o estudante do indicie 0
        estudantes.remove("Pedro");

        // Retorna o valor da chave informada para uma variável compatível a ela
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        // Retorna o tamanho do map
        estudantes.size();

        // Navegando nos registro do map
        System.out.println("\nUtilizando For 1:");
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println("\nUtilizando For 1:");
        for (String key: estudantes.keySet()){
            System.out.println(key + " --> " + estudantes.get(key));
        }

        // Exibindo Map atual
        System.out.println(" ");
        System.out.println(estudantes);
    }
}
