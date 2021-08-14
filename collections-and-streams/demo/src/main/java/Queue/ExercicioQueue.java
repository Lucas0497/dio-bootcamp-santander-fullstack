package Queue;

/*
 CRIE UMA FILA E EXECUTE AS SEGUINTES OPERAÇÕES:
 - Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
 - Navegue na fila exibindo cada nome no console.
 - Retorne o primeiro item da fila sem remove-lo.
 - Retorne o primeiro item da fila removendo o mesmo.
 - Adicione um novo nome Daniel e verifique a posição que o mesmo se encontra na fila.
 - Retorne o tamanho da lista.
 - Verifique se a lista esta vazia.
 - Verifique se o nome Carlos está na lista.

 */

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        System.out.println("A fila foi instanciada");


        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
        System.out.println("Os 5 nomes foram adicionados a fila.");

        System.out.println("Navegando pela fila e exibindo cada elemento.");
        for (String navegando: fila){
            System.out.println(navegando);
        }

        System.out.println("Retornando o primeiro elemento da fila sem remove-lo.");
        String peek = fila.peek();
        System.out.println(peek);
        System.out.println(fila + "\n");

        System.out.println("Retornando e removendo o primeiro elemento da fila");
        String poll = fila.poll();
        System.out.println(poll);
        System.out.println(fila + "\n");

        System.out.println("Adicionando o elemento Daniel a fila e informando a posição do mesmo.");
        fila.add("Daniel");
        int a = fila.size(); // Se foi o ultimo a entrar, é a ultima posição que é == ao tamanho da lista =D
        System.out.println(a);

        System.out.println("Retornando o tamanho da fila");
        System.out.println(a);

        System.out.print("A fila está vazia ? ");
        boolean empty = fila.isEmpty();
        System.out.println(empty);

        System.out.print("O nome Carlos está na fila ? ");
        boolean contains = fila.contains("Carlos");
        System.out.println(contains);

        System.out.println("Resultado final da fila:");
        System.out.println(fila);






    }
}
