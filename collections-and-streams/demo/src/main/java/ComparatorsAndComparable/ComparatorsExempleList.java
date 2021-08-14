package ComparatorsAndComparable;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;

import static java.util.Comparator.*;

public class ComparatorsExempleList {
    public static void main(String[] args) {
        // Instanciando a lista
        List<Estudante> estudantes = new ArrayList<>();

        // Adicionando elemento a lista
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- ORDEM DE INSERÇÃO ---");
        System.out.println(estudantes);

        // Ordena os alunos na ordem crescente de idade
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("\n--- ORDEM NATURAL DOS NÚMEROS - IDADE ---");
        System.out.println(estudantes);

        // Ordena os alunos na ordem decrescente de idade
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("\n--- ORDEM REVERSA DOS NÚMEROS - IDADE ---");
        System.out.println(estudantes);

        // Ordena os alunos em ordem de idade crescente, passando como parametro o int idade
        estudantes.sort(comparingInt(Estudante::getIdade));
        System.out.println("\n--- ORDEM NATURAL DOS NÚMEROS - IDADE (METHOD REFERENCE) ---");
        System.out.println(estudantes);

        // Ordena os alunos em ordem de idade decrescente, passando como parametro o int idade
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("\n--- ORDEM REVERSA DOS NÚMEROS - IDADE (METHOD REFERENCE) ---");
        System.out.println(estudantes);

        /*
         Ordena os alunos em ordem crescente de idade.
         Recebe apenas um argumento.

         Em caso de comparação, recebo um argumento mais um objeto já existente para comparação. == Classe atual vs Classe que servirá de parâmetro.

        */
        Collections.sort(estudantes);
        System.out.println("\n--- ORDEM NATURAL DOS NÚMEROS - IDADE (COMPARABLE) ---");
        System.out.println(estudantes);
        System.out.println(("\n--- ORDEM APÓS COMPARAÇÃO DOS NÚMEROS COM A CLASSE REVERSE - IDADE (COMPARABLE) ---"));
        Collections.sort(estudantes, new Reverse());
        System.out.println(estudantes);











    }
}
