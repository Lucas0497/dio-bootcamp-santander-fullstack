package Queue;

/*
java.util.LinkedList
          INTERFACE QUEUE / INTERFACE FILA
- Garante a ordem de inserção
- Permite adição, leitura e remoção considerando a regra basica de uma fila:
- O primeiro elemento que entra é o primeiro elemento que sai
- Não permite mudança de ordenação
-

 */

import java.util.LinkedList;
import java.util.Queue;

public class ExempleQueue {
    public static void main(String[] args) {
        // Instanciando Queue
        Queue<String> filaBanco = new LinkedList<>();

        // Adicionando elementos a fila
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // Retorna e remove o primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        // Retorna o primeiro da fila mas não o remove
        // Caso a fila esteja vazia, retorna null
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // Retorna o primeiro da fila mas não o remove
        // Caso a fila esteja vazia, retorna erro
        // NoSuchElementException
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroCliente);






    }
}
