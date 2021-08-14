package Streams;

/*

- Excelente para trabalhar com grande números de dados de maneira simples e performatica.
- Manipulação de coleções com o paradigma funcional de forma paralela.
- Imutável --> Não altera a coleção de origem, sempre cria uma nova coleção;
- Principais funcionalidades:
--> Mapping - Retorna uma coleção com o mesmo tamanho da origem com os elementos alterados.
--> Filtering - Retorna uma coleção igual ou menor que a coleção de origem, com os elementos intactos.
--> ForEach - Executa uma determinada lógica para cada elemento, não retornando nada.
--> Peek - Executa uma determinada lógica para cada elemento, retornando a própria coleção.
--> Couting - Retorna um inteiro que representa a contagem de elementos.
--> Grouping - Retorna uma coleção agrupada de acordo com a regra definida.

 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ExempleStreamApi {
    public static void main(String[] args) {

        // Criando a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adicionando estudantes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        // Retorna a contagem de elementos do stream
        System.out.println("Cotagem de elementos: " + estudantes.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("\nElemento com maior quantidade de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        // Retorna o elemento com menor número de letras
        System.out.println("\nElemento com menor quantidade de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        // Cria uma nova coleção que contem somente os elementos com a letra R no nome
        // O algoritmo faz uma verificação atribuindo true para os que contem R e false para os que não contem
        // E a partir disso, cria a nova coleção de nomes com R, ou seja, com os valores true
        // Obrigatoriamente, retorna uma coleção DO MESMO TAMANHO da coleção de origem
        System.out.println("\nElementos com a letra r no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção com os elementos concatenados e a quantidade de letras de cada elemento
        System.out.println("\nRetorna uma nova coleção com a quantidade de letras " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // Retorna somente os 3 primeiros elementos da coleção
        System.out.println("\nRetorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()) + "\n");

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("\nRetorna cada elemento: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento no console sem retornar outra coleção
        System.out.println("\nRetornando os elementos novamente com o uso de ForEach: ");
        estudantes.stream().forEach(System.out::println);

        // Retorna um boolean informando se todos os elementos possuem a característica informada como referencia, nesse caso, letra "w"
        System.out.println("\nTodos os elementos possuem a letra W no nome ? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        // Retorna um boolean informando se algum dos elementos possuem a característica informada como referencia, nesse caso, letra "a" minúscula
        // Se apenas um elemento conter a letra a minúscula, já é o suficiente para retornar True
        System.out.println("\nAlgum elemento possui a letra 'A' minúscula no nome : " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // Retorna o primeiro elemento da coleção e, caso exista, será exibido no console
        System.out.println("\nRetorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // Retorna true se nenhum elemento possuir a letra minuscula "a" no nome
        System.out.println("\nNão tem nenhum elemento com a letra minúscula 'a' no nome ? " + estudantes.stream().noneMatch((elemento)-> elemento.contains("a")));

        //Exemplo de operação encadeada
        System.out.println("\n Operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante ->
                estudante.concat(" -> "). concat(String.valueOf(estudante.length()))).peek(System.out::println).filter((estudante) ->
                        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));














    }
}
