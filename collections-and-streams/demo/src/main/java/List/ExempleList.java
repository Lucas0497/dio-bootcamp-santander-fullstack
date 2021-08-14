package List;

import java.util.*;

public class ExempleList {
    public static void main(String[] args) {

        // Instanciando lista do tipo string para nomes
        List<String> nomes = new ArrayList<>();

        // Adicionando conteúdo a lista
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Anderson");


        System.out.println(nomes);

        // Atribui valor ao indicie
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        // Ordenação da lista
        Collections.sort(nomes);
        System.out.println(nomes);

        // Remove o elemento na posição informada
        nomes.remove(4);
        System.out.println(nomes);

        // Remove o elemento passado como referencia
        nomes.remove("Juliana");
        System.out.println(nomes);

        // Retorna o elemento contido na posição de referencia
        String gets = nomes.get(1);
        System.out.println(gets);

        // Retorna o valor de elementos contidos na lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // Retorna um boolean informando se a lista contem determinado elemento
        boolean temLarissa = nomes.contains("Larissa");
        System.out.println(temLarissa);

        // Retorna um boolean para verificar se a lista esta vazia
        boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia);

        // Metodo para limpar lista
        // nomes.clear();
        // System.out.println(nomes);

        // Retorna um inteiro informando a posição de determinado elemento
        // Retorna o valor -1 caso o elemento não exista
        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);

        // Forma imperativa para percorrer a lista
        //Executa o código para cada item da lista
        for (String nomeDoItem: nomes){
            System.out.println("--> " + nomeDoItem);
        }

        // Retorna um interetor de String
        Iterator<String>  iterator = nomes.iterator();
        // O objeto iterator pode ser navegado através de um While
        while (iterator.hasNext()){
            // Retorna um boolean informamndo se possui mais elementos na lista
            // Netx irá retornar o elemento contido no indice atual
            System.out.println("------> " + iterator.next());
        }








    }
}
