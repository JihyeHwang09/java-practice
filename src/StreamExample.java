import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class StreamExample {
    Set<Integer> evenSet = Stream.iterate(1, n -> n+1)
    .limit(6)
    .filter(number -> number % 2 == 0)
    .collect(toSet());


    public static void main(String[] args) {

    }
}

