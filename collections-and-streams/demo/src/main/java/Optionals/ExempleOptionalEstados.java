package Optionals;

/*
- Permite tratamento para valores que podem ser nulos.
- Possui dois estados --> PRESENTE E VAZIO.
- Permite que você execute operação em valores que podem ser nulo
sem preocupação com as famosas NullPointerExceptions =D

 */

import java.util.Optional;

public class ExempleOptionalEstados {
    public static void main(String[] args) {

        // Instanciando
        // Optional esta presente pois recebe um valor diferente de null
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        // Metodo recebe dois argumentos, o primeiro é uma função labda que será executada se o valor estiver presente
        // E a segunda também é uma lambda que será executada caso o valor não esteja presente.
        // Passa como parametro o valor que esta dentro do optional, nesse caso "Valor presente"
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

        //
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("\n Valor opcional que não esta presente");
        optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.println(" null = não esta presente"));
        
    }
}
