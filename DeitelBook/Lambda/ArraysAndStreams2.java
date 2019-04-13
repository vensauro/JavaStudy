import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * ArraysAndStreams2
 */
public class ArraysAndStreams2 {

    public static void main(String[] args) {
        
        String[] strings = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        // exibe as strings originais
        System.out.printf("Original Strings: %s\n", Arrays.asList(strings));

        // strings em maiúsculas
        System.out.printf("strings in uppercase: %s\n", 
            Arrays.stream(strings)
            .map(String::toUpperCase)
            .collect(Collectors.toList())
        );

        // strings menores que “n” (sem distinção maiúsc/minúsc) em ordem crescente
        System.out.printf("strings greater than m sorted ascending: %s%n",
            Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList())
        );
        
        // strings menores que “n” (com distinção maiúsc/minúsc) em ordem decrescente
        System.out.printf("strings greater than m sorted descending: %s%n",
            Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") < 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList())
        );

    }
}